package ru.yurii.di

/**
 * @author y.anisimov
 */
interface InjectItemProvider <T> {
    fun provide(injector: Injector): T
    fun clean()
}

