package com.example.rnsub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val goToRN = findViewById<Button>(R.id.goToRN)
        goToRN.setOnClickListener {
            val intent = Intent(this@MainActivity, RNModuleActivity::class.java)
            startActivity(intent)
        }
    }
}