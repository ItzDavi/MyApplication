package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Yes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yes)

        val closeButton = findViewById<Button>(R.id.guudbai)
        var clickCounter = 0

        closeButton.setOnClickListener {
            clickCounter++
            if (clickCounter == 5) {
                Toast.makeText(this, "Maybe clicking it again 15 times, it will fix it", Toast.LENGTH_SHORT).show()
            } else if (clickCounter == 10) {
                Toast.makeText(this, "Maybe clicking it again 10 times, it will fix it", Toast.LENGTH_SHORT).show()
            } else if (clickCounter == 15) {
                Toast.makeText(this, "Maybe clicking it again 5 times, it will fix it", Toast.LENGTH_SHORT).show()
            } else if (clickCounter >= 20) {
                finish()
            }
        }
    }
}