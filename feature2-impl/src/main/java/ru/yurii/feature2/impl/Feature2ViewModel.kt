package ru.yurii.feature2.impl

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

interface Feature2ViewModel {
    val payload: LiveData<Pair<String, String>>

    fun doAction()
}

class Feature2ViewModelImpl(
    private val useCaseA: UseCaseA,
    private val useCaseB: UseCaseB
) : ViewModel(), Feature2ViewModel {

    override val payload: MutableLiveData<Pair<String, String>> = MutableLiveData()

    override fun doAction() {
        payload.value = useCaseA() to useCaseB()
    }
}
