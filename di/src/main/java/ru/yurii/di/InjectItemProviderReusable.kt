package ru.yurii.di

import java.lang.ref.WeakReference

/**
 * @author y.anisimov
 */
class InjectItemProviderReusable <T> (
    private val builder: InjectItemBuilder<T>
) : InjectItemProvider<T> {

    private var item: WeakReference<T?> = WeakReference(null)

    override fun provide(injector: Injector): T {
        return item.get() ?: builder(injector).also { item = WeakReference(it) }
    }

    override fun clean() {
        item = WeakReference(null)
    }
}
