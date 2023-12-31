package com.example.madcamp_androidproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomnavigation.LabelVisibilityMode


class QuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val btnQuiz : Button = findViewById(R.id.btn_vocaquiz)
        btnQuiz.setOnClickListener {
            val intent = Intent(this, QuizQuestionActivity::class.java)
            startActivity(intent)
            finish()
        }
        val bottomNavView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_phonenumber -> {
                    val intent = Intent(this, ContactActivity::class.java)
                    startActivity(intent)
                    true
                }

                R.id.navigation_photo -> {
                    val intent = Intent(this, PhotoActivity::class.java)
                    startActivity(intent)
                    true
                }

                R.id.navigation_english -> {
                    true
                }

                else -> false
            }
        }

        bottomNavView.selectedItemId = R.id.navigation_english

    }
}