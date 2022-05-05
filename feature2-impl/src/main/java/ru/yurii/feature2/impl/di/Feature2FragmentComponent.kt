package ru.yurii.feature2.impl.di

import ru.yurii.feature2.impl.UseCaseA
import ru.yurii.feature2.impl.UseCaseAImpl
import ru.yurii.feature2.impl.UseCaseB
import ru.yurii.feature2.impl.UseCaseBImpl

/**
 * @author y.anisimov
 */
internal interface Feature2FragmentComponent {
    fun useCaseA(): UseCaseA
    fun useCaseB(): UseCaseB
}

internal class Feature2FragmentModule(
    dependencies: Feature2Dependencies
) : Feature2FragmentComponent, Feature2Dependencies by dependencies {

    override fun useCaseA(): UseCaseA = UseCaseAImpl(version)

    override fun useCaseB(): UseCaseB = UseCaseBImpl(version)
}

internal class Feature2FragmentComponentImpl(
    private val dependencies: Feature2Dependencies,
    private val model: Feature2FragmentModule = Feature2FragmentModule(dependencies)
) : Feature2FragmentComponent by model

internal object Feature2FragmentComponentCreator {
    fun create(dependencies: Feature2Dependencies): Feature2FragmentComponent {
        return Feature2FragmentComponentImpl(dependencies)
    }
}
