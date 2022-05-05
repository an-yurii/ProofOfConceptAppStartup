package ru.yurii.feature.app.info

/**
 * @author y.anisimov
 */
class AppInfoImpl(
    override val versionCode: Int,
    override val versionName: String,
    override val applicationId: String
) : AppInfo {

    companion object {
        fun fromBuildConfig(
            versionCode: Int,
            versionName: String,
            applicationId: String
        ): AppInfo {
            return AppInfoImpl(
                versionCode = versionCode,
                versionName = versionName,
                applicationId = applicationId,
            )
        }
    }
}
