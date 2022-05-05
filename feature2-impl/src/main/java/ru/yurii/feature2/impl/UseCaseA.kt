package ru.yurii.feature2.impl

interface UseCaseA {
    operator fun invoke(): String
}

class UseCaseAImpl(
    private val objectVersion: String
) : UseCaseA {
    override fun invoke() = "UseCaseA: $objectVersion"
}
