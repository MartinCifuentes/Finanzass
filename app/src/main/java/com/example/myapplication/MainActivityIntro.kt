package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import android.content.Intent
import android.util.Log

class MainActivityIntro : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_intro)
        super.onCreate(savedInstanceState)
        val buttonlogin = findViewById<Button>(R.id.button_login)
        buttonlogin.setOnClickListener {
            Log.d("MainActivityIntro", "Login button clicked") // Mensaje de depuración
            try {
                val intent = Intent(this, MainActivityLogin::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Log.e("MainActivityIntro", "Error starting MainActivityLogin", e) // Error de depuración
            }
        }

        val buttonsignup = findViewById<Button>(R.id.button_signup)

        buttonsignup.setOnClickListener {
            val intent = Intent(this, MainActivitySignup::class.java)
            startActivity(intent)
        }
    }
}
