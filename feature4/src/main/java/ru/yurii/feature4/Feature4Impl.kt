package ru.yurii.feature4

/**
 * @author y.anisimov
 */
internal class Feature4Impl(
    private val versionName: String,
    private val versionCode: Int
) : Feature4 {
    override fun payload(): String = "$versionName:$versionCode"
}
