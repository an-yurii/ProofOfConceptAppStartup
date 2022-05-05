package ru.yurii.feature2.impl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.yurii.di.ext.getInjector
import ru.yurii.di.get
import ru.yurii.feature.api.url.provider.ApiUrlProvider

class Feature2Fragment : Fragment() {

    companion object {
        fun newInstance() = Feature2Fragment()
    }

    private val viewModel: Feature2ViewModel by viewModels {
        Feature2ViewModelFactory(getInjector().get())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.payload.observe(viewLifecycleOwner) {
            view.findViewById<TextView>(R.id.useCaseA).text = it.first
            view.findViewById<TextView>(R.id.useCaseB).text = it.second
        }
        viewModel.doAction()

        val apiUrlProvider = this.getInjector().get<ApiUrlProvider>()
        view.findViewById<TextView>(R.id.url).text = apiUrlProvider.url
    }
}
