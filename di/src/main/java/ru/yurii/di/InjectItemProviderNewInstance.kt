package ru.yurii.di

/**
 * @author y.anisimov
 */
class InjectItemProviderNewInstance <T> (
    private val builder: InjectItemBuilder<T>
) : InjectItemProvider<T> {

    override fun provide(injector: Injector): T = builder(injector)

    override fun clean() = Unit
}
