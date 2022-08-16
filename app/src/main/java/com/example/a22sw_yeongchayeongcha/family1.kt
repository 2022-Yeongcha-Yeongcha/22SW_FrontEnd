package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityFamily1Binding


class Family1: AppCompatActivity() {
    lateinit var binding: ActivityFamily1Binding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFamily1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.family1button.setOnClickListener{
            val intent=Intent(this,Family2::class.java)
        }

        binding.familyback.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
        }

        binding.familysos.setOnClickListener{
            val intent=Intent(this,Sos::class.java)
        }


    }
}