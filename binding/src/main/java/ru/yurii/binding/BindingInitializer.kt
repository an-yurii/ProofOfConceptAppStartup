package ru.yurii.binding

import androidx.startup.Initializer
import ru.yurii.di.ext.InitializersContainer

/**
 * @author y.anisimov
 */
class BindingInitializer : InitializersContainer() {

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf(
        Feature2DependenciesInitializer::class.java,
        Feature4Initializer::class.java,
        Feature4DependenciesInitializer::class.java
    )
}
