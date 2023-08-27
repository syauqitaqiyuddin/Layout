package com.example.layout

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        with(binding){
            bt1.setOnClickListener{
                Toast.makeText(this@MainActivity,"Login Berhasil "+name.text +"!",Toast.LENGTH_LONG).show()
            }
        bt2.setOnClickListener{
            System.exit(0)
            }
        }
    }
}