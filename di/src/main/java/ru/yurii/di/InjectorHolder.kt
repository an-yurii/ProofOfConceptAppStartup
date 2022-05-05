package ru.yurii.di

/**
 * @author y.anisimov
 */
object InjectorHolder {
    @Volatile
    private var injector: Injector? = null

    fun set(injector: Injector) {
        this.injector = injector
    }

    fun get(): Injector = requireNotNull(injector) { "Injector is not defined" }
}
