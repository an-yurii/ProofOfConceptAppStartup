package ru.yurii.di.ext

import android.app.Application
import android.content.Context
import ru.yurii.di.Injector
import ru.yurii.di.InjectorHolder
import ru.yurii.di.InjectorImpl

/**
 * @author y.anisimov
 */
abstract class InjectorApp : Application() {
//    abstract val injector: Injector
    open val injector: Injector = InjectorImpl().also {
        InjectorHolder.set(it)
    }
}

fun Context.getInjector(): Injector = (this.applicationContext as InjectorApp).injector
