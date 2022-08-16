package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivitySosBinding


class Sos: AppCompatActivity() {
    lateinit var binding: ActivitySosBinding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton5.setOnClickListener{
            val intent=Intent(this,Sos::class.java)
        }

        binding.imageButton3.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
        }


    }
}