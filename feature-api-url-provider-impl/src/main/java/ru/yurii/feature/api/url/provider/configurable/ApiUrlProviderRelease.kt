package ru.yurii.feature.api.url.provider.configurable

import ru.yurii.feature.api.url.provider.ApiUrlProvider

/**
 * @author y.anisimov
 */
class ApiUrlProviderRelease : ApiUrlProvider {
    override val url: String
        get() = "release"
}
