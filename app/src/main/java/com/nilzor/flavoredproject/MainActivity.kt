package com.nilzor.flavoredproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.nilzor.alpha.AlphaOne
import com.nilzor.bravo.BravoOne

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.theText).setText(AlphaOne().text + " - " + BravoOne().charlie.text)
    }
}