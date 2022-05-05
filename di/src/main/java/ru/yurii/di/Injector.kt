package ru.yurii.di

interface Injector {
    fun registerProviderWithKey(key: Class<*>, provider: InjectItemProvider<*>)
    fun <T> getByKey(key: Class<*>): T?
    fun clean()
}

inline fun <reified T> Injector.registerProvider(provider: InjectItemProvider<T>) {
    registerProviderWithKey(T::class.java, provider as InjectItemProvider<*>)
}

inline fun <reified T> Injector.get(): T = getByKey(T::class.java) ?: error("${T::class.java} is not found")
