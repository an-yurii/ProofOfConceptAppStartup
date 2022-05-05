package ru.yurii.binding

import android.content.Context
import androidx.startup.Initializer
import ru.yurii.di.InjectItemProviderReusable
import ru.yurii.di.ext.getInjector
import ru.yurii.di.get
import ru.yurii.di.registerProvider
import ru.yurii.feature.app.info.AppInfo
import ru.yurii.feature4.Feature4Dependencies

/**
 * @author y.anisimov
 */
class Feature4DependenciesInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        context.getInjector().registerProvider(
            InjectItemProviderReusable { injector ->
                val feature4Dependencies = object : Feature4Dependencies {
                    override val appInfo: AppInfo
                        get() = injector.get()
                } as Feature4Dependencies
                feature4Dependencies
            }
        )
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}
