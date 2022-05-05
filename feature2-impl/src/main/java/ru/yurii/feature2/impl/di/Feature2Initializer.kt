package ru.yurii.feature2.impl.di

import ru.yurii.di.InjectItemProviderNewInstance
import ru.yurii.di.Injector
import ru.yurii.di.ext.InitializerForInjectItem
import ru.yurii.feature2.Feature2
import ru.yurii.feature2.impl.Feature2Impl

/**
 * @author y.anisimov
 */
class Feature2Initializer : InitializerForInjectItem() {

    override fun registerInjectItem(appInjector: Injector) {
        appInjector.registerProviderWithKey(
            Feature2::class.java,
            InjectItemProviderNewInstance { Feature2Impl() }
        )
    }
}
