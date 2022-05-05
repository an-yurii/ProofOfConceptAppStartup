package ru.yurii.di

/**
 * @author y.anisimov
 */
class InjectItemProviderSingle <T> (
    private val builder: InjectItemBuilder<T>
) : InjectItemProvider<T> {

    private var item: T? = null

    override fun provide(injector: Injector): T {
        return item ?: synchronized(this) {
            item ?: builder(injector).also { item = it }
        }
    }

    override fun clean() {
        item = null
    }
}
