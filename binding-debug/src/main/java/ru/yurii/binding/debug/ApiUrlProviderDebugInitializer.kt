package ru.yurii.binding.debug

import ru.yurii.di.InjectItemProviderReusable
import ru.yurii.di.Injector
import ru.yurii.di.ext.InitializerForInjectItem
import ru.yurii.feature.api.url.provider.ApiUrlProvider
import ru.yurii.feature.api.url.provider.configurable.ApiUrlProviderConfigurable
import ru.yurii.feature.api.url.provider.configurable.ApiUrlProviderDebug

/**
 * @author y.anisimov
 */
class ApiUrlProviderDebugInitializer : InitializerForInjectItem() {
    override fun registerInjectItem(appInjector: Injector) {
        appInjector.registerProviderWithKey(
            ApiUrlProvider::class.java,
            InjectItemProviderReusable {
                ApiUrlProviderConfigurable(ApiUrlProviderDebug())
            }
        )
    }
}
