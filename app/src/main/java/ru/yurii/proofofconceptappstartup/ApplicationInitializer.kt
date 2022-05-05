package ru.yurii.proofofconceptappstartup

import androidx.startup.Initializer
import ru.yurii.di.ext.InitializersContainer

/**
 * @author y.anisimov
 */
class ApplicationInitializer : InitializersContainer() {
    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf(
        AppInfoInitializer::class.java
    )
}
