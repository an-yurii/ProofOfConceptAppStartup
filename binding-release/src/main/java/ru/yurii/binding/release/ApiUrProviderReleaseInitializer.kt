package ru.yurii.binding.release

import ru.yurii.di.InjectItemProviderReusable
import ru.yurii.di.Injector
import ru.yurii.di.ext.InitializerForInjectItem
import ru.yurii.feature.api.url.provider.ApiUrlProvider
import ru.yurii.feature.api.url.provider.configurable.ApiUrlProviderRelease

/**
 * @author y.anisimov
 */
class ApiUrProviderReleaseInitializer : InitializerForInjectItem() {
    override fun registerInjectItem(appInjector: Injector) {
        appInjector.registerProviderWithKey(
            ApiUrlProvider::class.java,
            InjectItemProviderReusable { ApiUrlProviderRelease() }
        )
    }
}
