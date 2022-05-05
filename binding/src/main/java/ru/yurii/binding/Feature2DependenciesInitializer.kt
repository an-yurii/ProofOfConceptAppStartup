package ru.yurii.binding

import ru.yurii.di.InjectItemProviderNewInstance
import ru.yurii.di.Injector
import ru.yurii.di.ext.InitializerForInjectItem
import ru.yurii.di.get
import ru.yurii.feature.app.info.AppInfo
import ru.yurii.feature2.impl.di.Feature2Dependencies

/**
 * @author y.anisimov
 */
class Feature2DependenciesInitializer : InitializerForInjectItem() {

    override fun registerInjectItem(appInjector: Injector) {
        appInjector.registerProviderWithKey(
            Feature2Dependencies::class.java,
            InjectItemProviderNewInstance { injector ->
                object : Feature2Dependencies {
                    override val version: String
                        get() = injector.get<AppInfo>().toString()
                }
            }
        )
    }
}
