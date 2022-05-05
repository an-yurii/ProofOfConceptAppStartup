package ru.yurii.proofofconceptappstartup

import ru.yurii.di.InjectItemProviderSingle
import ru.yurii.di.Injector
import ru.yurii.di.ext.InitializerForInjectItem
import ru.yurii.di.registerProvider
import ru.yurii.feature.app.info.AppInfoImpl

/**
 * @author y.anisimov
 */
class AppInfoInitializer : InitializerForInjectItem() {

    override fun registerInjectItem(appInjector: Injector) {
        appInjector.registerProvider(
            InjectItemProviderSingle {
                AppInfoImpl.fromBuildConfig(
                    versionCode = BuildConfig.VERSION_CODE,
                    versionName = BuildConfig.VERSION_NAME,
                    applicationId = BuildConfig.APPLICATION_ID
                )
            }
        )
    }
}
