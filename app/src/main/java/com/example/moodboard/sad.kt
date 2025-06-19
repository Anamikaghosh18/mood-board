package com.example.moodboard

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sad)
        val inputbox = findViewById<EditText>(R.id.inputbox)
        val savemood = findViewById<Button>(R.id.savemood)
        val boost = findViewById<Button>(R.id.boost)
        val usermsg = findViewById<TextView>(R.id.usermsg)
        val quote = findViewById<TextView>(R.id.quote)
        val watch = findViewById<Button>(R.id.watch)

        savemood.setOnClickListener{
            val usertext = inputbox.text.toString().trim()
            if(usertext.isNotEmpty()){
                val b = AlertDialog.Builder(this)
                b.setTitle("Diary Entry")
                b.setTitle("Do you want to tell more?")
                b.setPositiveButton("Yes"){dialog,_->finish()}
                b.setNegativeButton("No"){dialog,_->dialog.dismiss()}

                b.create().show()
            }
            else{
                usermsg.text="It's okay if you don't want to share."
            }
            usermsg.visibility = View.VISIBLE
        }
    }
}