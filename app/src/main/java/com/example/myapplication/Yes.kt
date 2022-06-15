package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Yes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yes)

        val closeButton = findViewById<Button>(R.id.guudbai)
        var clickCounter = 0

        closeButton.setOnClickListener {
            if (clickCounter >= 20) {
                finish()
            } else {
                clickCounter++
            }
        }
    }
}