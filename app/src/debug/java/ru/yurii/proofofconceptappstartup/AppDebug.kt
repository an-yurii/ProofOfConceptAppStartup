package ru.yurii.proofofconceptappstartup

import ru.yurii.di.Injector
import ru.yurii.di.debug.InjectorDebug

/**
 * @author y.anisimov
 */
class AppDebug : App() {
    override val injector: Injector = InjectorDebug(super.injector)
}
