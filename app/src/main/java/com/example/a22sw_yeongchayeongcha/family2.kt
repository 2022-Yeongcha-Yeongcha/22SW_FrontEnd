package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityFamily2Binding


class Family2: AppCompatActivity() {
    lateinit var binding: ActivityFamily2Binding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFamily2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.family2addfam.setOnClickListener{
            val intent=Intent(this,Family3::class.java)
        }

        binding.familyback.setOnClickListener{
            val intent=Intent(this,Family1::class.java)
        }

        binding.familysos.setOnClickListener{
            val intent=Intent(this,Sos::class.java)
        }


    }
}