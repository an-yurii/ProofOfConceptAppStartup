package ru.yurii.di.ext

import android.content.Context
import androidx.startup.Initializer
import ru.yurii.di.Injector

/**
 * @author y.anisimov
 */
abstract class InitializerForInjectItem : Initializer<Unit> {

    override fun create(context: Context) {
        registerInjectItem(context.getInjector())
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()

    abstract fun registerInjectItem(appInjector: Injector)
}
