package com.example.helloandroidui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editName = findViewById<TextInputEditText>(R.id.editName)
        val btnGreet = findViewById<MaterialButton>(R.id.btnGreet)
        val btnSecond = findViewById<MaterialButton>(R.id.btnSecond)

        btnGreet.setOnClickListener {
            val name = editName.text.toString().trim()
            val greeting = if (name.isEmpty()) "Hey stranger! 👋" else "Hello $name! 🎉"
            Toast.makeText(this, greeting, Toast.LENGTH_LONG).show()
        }

        btnSecond.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}