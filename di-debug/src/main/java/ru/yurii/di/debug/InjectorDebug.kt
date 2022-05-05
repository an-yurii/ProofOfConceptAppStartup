package ru.yurii.di.debug

import ru.yurii.di.InjectItemProvider
import ru.yurii.di.Injector

class InjectorDebug(
    private val origin: Injector,
    private val keys: MutableList<Class<*>> = mutableListOf(),
    private var validated: Boolean = false
) : Injector by origin {

    override fun registerProviderWithKey(key: Class<*>, provider: InjectItemProvider<*>) {
        keys.add(key)
        origin.registerProviderWithKey(key, provider)
    }

    override fun <T> getByKey(key: Class<*>): T? {
        if (!validated) {
            validate()
        }
        return origin.getByKey(key)
    }

    private fun validate() {
        checkDuplications()
        checkDependencies()
        validated = true
    }

    private fun checkDuplications() {
        val duplications = keys.groupBy { it }.filterValues { it.size > 1 }.keys
        if (duplications.isNotEmpty()) {
            throw IllegalStateException("Injected items duplications are detected: ${duplications.joinToString { it.name }}")
        }
    }

    private fun checkDependencies() {
        // не работает так как зависимость вызывается по другому ключу
        keys.forEach {
            if (origin.getByKey<Any>(it) == null) {
                throw IllegalStateException("Injected item $it is not found")
            }
        }
        origin.clean()
    }
}
