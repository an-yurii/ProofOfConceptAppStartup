package ru.yurii.di.ext

import android.app.Activity
import androidx.fragment.app.Fragment
import ru.yurii.di.Injector

/**
 * @author y.anisimov
 */
fun Activity.getInjector(): Injector = this.applicationContext.getInjector()

fun Fragment.getInjector(): Injector = this.requireContext().getInjector()
