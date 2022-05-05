package ru.yurii.di

class InjectorImpl(
    private val providers: MutableMap<Class<*>, InjectItemProvider<*>> = mutableMapOf()
) : Injector {

    override fun registerProviderWithKey(key: Class<*>, provider: InjectItemProvider<*>) {
        providers[key] = provider
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T> getByKey(key: Class<*>): T? {
        return providers[key]?.provide(this) as T?
    }

    override fun clean() {
        providers.forEach { it.value.clean() }
    }
}
