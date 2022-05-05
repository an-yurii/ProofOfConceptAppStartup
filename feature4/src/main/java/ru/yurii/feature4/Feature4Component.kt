package ru.yurii.feature4

/**
 * @author y.anisimov
 */
interface Feature4Component {
    fun feature4(): Feature4
}

internal interface Feature4Module : Feature4Component {

    class Impl(dependencies: Feature4Dependencies) : Feature4Module, Feature4Dependencies by dependencies{

        override fun feature4(): Feature4 = Feature4Impl(appInfo.versionName, appInfo.versionCode)
    }
}

internal class Feature4ComponentImpl(
    dependencies: Feature4Dependencies,
    module: Feature4Module = Feature4Module.Impl(dependencies)
) : Feature4Component by module

object Feature4ComponentCreator {
    fun create(dependencies: Feature4Dependencies): Feature4Component = Feature4ComponentImpl(dependencies)
}
