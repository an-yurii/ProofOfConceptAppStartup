package ru.yurii.feature2.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.yurii.feature2.impl.di.Feature2Dependencies
import ru.yurii.feature2.impl.di.Feature2FragmentComponentCreator

/**
 * @author y.anisimov
 */
internal class Feature2ViewModelFactory(
    private val feature2Dependencies: Feature2Dependencies
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val component = Feature2FragmentComponentCreator.create(feature2Dependencies)
        return Feature2ViewModelImpl(
            useCaseA = component.useCaseA(),
            useCaseB = component.useCaseB()
        ) as T
    }
}
