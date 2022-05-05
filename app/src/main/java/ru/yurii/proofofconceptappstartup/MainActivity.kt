package ru.yurii.proofofconceptappstartup

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.yurii.di.ext.getInjector
import ru.yurii.di.get
import ru.yurii.feature2.Feature2
import ru.yurii.feature4.Feature4Component

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val feature4Component = this.getInjector().get<Feature4Component>()
            findViewById<TextView>(R.id.message).text = feature4Component.feature4().payload()

            val feature2 = this.getInjector().get<Feature2>()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, feature2.fragment())
                .commit()
        }
    }
}
