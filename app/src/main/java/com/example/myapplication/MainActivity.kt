package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.marginBottom
import androidx.core.view.marginEnd
import androidx.core.view.marginTop

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.statusBarColor = getColor(R.color.black)

        val yesButton = findViewById<Button>(R.id.yes_button)
        val noButton = findViewById<Button>(R.id.no_button)

        noButton.setOnClickListener {
            val randomEnd = (-50..0).shuffled().last()
            val randomBottom = if (randomEnd < 0) {
                (50..100).shuffled().last()
            } else if (randomEnd > 0) {
                (-100..50).shuffled().last()
            } else {
                3
            }

            val displayMetrics = DisplayMetrics()
            val screenWidth = displayMetrics.widthPixels
            val screenHeight = displayMetrics.heightPixels

            val param = noButton.layoutParams as ViewGroup.MarginLayoutParams

            if (noButton.x + noButton.width > screenWidth) {
                param.setMargins(0,0,screenWidth - noButton.width + 20,noButton.marginBottom + randomBottom)

            } else if (noButton.y + noButton.height > screenHeight) {
                param.setMargins(0,0,noButton.marginEnd + randomEnd,screenHeight - noButton.height + 20)

            } else {
                param.setMargins(0,0,noButton.marginEnd + randomEnd,noButton.marginBottom + randomBottom)
            }

            noButton.layoutParams = param
        }

        yesButton.setOnClickListener {
            val intent = Intent(this, Yes::class.java)
            startActivity(intent)
            finish()
        }
    }

}