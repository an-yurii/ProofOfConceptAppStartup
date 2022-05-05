package ru.yurii.binding.debug

import androidx.startup.Initializer
import ru.yurii.di.ext.InitializersContainer

/**
 * @author y.anisimov
 */
class BindingDebugInitializer : InitializersContainer() {
    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf(
        ApiUrlProviderDebugInitializer::class.java
    )
}
