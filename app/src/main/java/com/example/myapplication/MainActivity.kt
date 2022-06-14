package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.marginEnd

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yesButton = findViewById<Button>(R.id.yes_button)

        val noButton = findViewById<Button>(R.id.no_button)
        noButton.setOnClickListener {

            var marginEnd = 5
            var marginBottom = -5

        }
    }

}