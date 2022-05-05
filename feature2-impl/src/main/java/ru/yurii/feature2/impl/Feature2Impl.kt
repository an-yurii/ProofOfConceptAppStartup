package ru.yurii.feature2.impl

import androidx.fragment.app.Fragment
import ru.yurii.feature2.Feature2

/**
 * @author y.anisimov
 */
class Feature2Impl : Feature2 {
    override fun fragment(): Fragment = Feature2Fragment.newInstance()
}
