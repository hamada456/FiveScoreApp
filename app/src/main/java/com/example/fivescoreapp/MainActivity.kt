package com.example.fivescoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvScore:TextView = findViewById(R.id.tvScore)
        val btnMinus:Button = findViewById(R.id.btnMinus)
        val btnPlus:Button = findViewById(R.id.btnPlus)
        var num = 0

        //＋ボタンを押したら1増える
        btnPlus.setOnClickListener {
            num++
            tvScore.text = num.toString()
        }
        btnMinus.setOnClickListener {
            num--
            tvScore.text = num.toString()
        }
    }
}