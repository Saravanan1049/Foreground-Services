package com.example.newone

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.newone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonStart.setOnClickListener(View.OnClickListener {
            ForegroundService.startService(this, "This is example of remainder notification and wake up man and wake them to work 😊😊😊")
        })
        binding.buttonStop.setOnClickListener(View.OnClickListener {
            ForegroundService.stopService(this)
        })
    }
}