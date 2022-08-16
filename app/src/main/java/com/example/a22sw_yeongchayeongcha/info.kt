package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityInfoBinding


class Info: AppCompatActivity() {
    lateinit var binding: ActivityInfoBinding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView13.setOnClickListener{
            val intent=Intent(this,My::class.java)
        }

        binding.imageButton2.setOnClickListener{
            val intent=Intent(this,Sos::class.java)
        }


    }
}