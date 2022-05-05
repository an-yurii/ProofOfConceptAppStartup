package ru.yurii.binding

import android.content.Context
import androidx.startup.Initializer
import ru.yurii.di.InjectItemProviderReusable
import ru.yurii.di.ext.getInjector
import ru.yurii.di.get
import ru.yurii.di.registerProvider
import ru.yurii.feature4.Feature4ComponentCreator

/**
 * @author y.anisimov
 */
class Feature4Initializer : Initializer<Unit> {
    override fun create(context: Context) {
        context.getInjector().registerProvider(
            InjectItemProviderReusable { injector ->
                Feature4ComponentCreator.create(dependencies = injector.get())
            }
        )
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}
