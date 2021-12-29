package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_service.setOnClickListener {
            Intent(this, HelloService::class.java).apply {
                startService(this)
            }
        }
        stop_service.setOnClickListener {
            Intent(this, HelloService::class.java).apply {
                stopService(this)
            }
        }
    }
}