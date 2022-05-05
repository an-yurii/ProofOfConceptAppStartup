package ru.yurii.feature.api.url.provider.configurable

import ru.yurii.feature.api.url.provider.ApiUrlProvider

class ApiUrlProviderConfigurable(
    private val origin: ApiUrlProvider
) : ApiUrlProvider {
    override val url: String
        get() = "configurable: ${origin.url}"
}
