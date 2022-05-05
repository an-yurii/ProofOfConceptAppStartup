package ru.yurii.binding.release

import androidx.startup.Initializer
import ru.yurii.di.ext.InitializersContainer

/**
 * @author y.anisimov
 */
class BindingReleaseInitializer : InitializersContainer() {
    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf(

    )
}
