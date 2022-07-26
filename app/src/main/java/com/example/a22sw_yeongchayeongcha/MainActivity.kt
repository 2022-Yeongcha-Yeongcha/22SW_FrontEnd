package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityMainBinding
/*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
*/


class MainActivity: AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginText.setOnClickListener{
            val intent=Intent(this,temporary_fragment::class.java)
        }


    }
}