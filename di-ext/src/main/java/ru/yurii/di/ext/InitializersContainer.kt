package ru.yurii.di.ext

import android.content.Context
import androidx.startup.Initializer

/**
 * @author y.anisimov
 */
abstract class InitializersContainer : Initializer<Unit> {
    override fun create(context: Context) = Unit
}
