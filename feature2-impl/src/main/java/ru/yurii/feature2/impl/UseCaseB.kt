package ru.yurii.feature2.impl

interface UseCaseB {
    operator fun invoke(): String
}

class UseCaseBImpl(
    private val objectVersion: String
) : UseCaseB {
    override fun invoke() = "UseCaseB: $objectVersion"
}
