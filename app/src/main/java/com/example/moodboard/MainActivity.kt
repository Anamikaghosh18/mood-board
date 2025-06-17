package com.example.moodboard

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val emojiHappy = findViewById<ImageButton>(R.id.happy)
        emojiHappy.setOnClickListener {
            val happyView = Intent(this, happy::class.java)
            startActivity(happyView)
        }
    }
}