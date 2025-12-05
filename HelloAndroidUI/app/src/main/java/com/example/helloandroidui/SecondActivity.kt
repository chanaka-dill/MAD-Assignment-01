package com.example.helloandroidui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val features = listOf(
            Feature("Jetpack Compose", "Modern toolkit for building native UI"),
            Feature("Material 3", "Beautiful, customizable design system"),
            Feature("Kotlin Coroutines", "Lightweight async programming"),
            Feature("Room Database", "Fluent SQLite abstraction"),
            Feature("Navigation Component", "Handle everything needed for in-app navigation")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = FeatureAdapter(features)
    }
}