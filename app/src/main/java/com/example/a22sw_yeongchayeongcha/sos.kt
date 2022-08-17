package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivitySosBinding

/*
verride fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*로그인 버튼 누르면 그 때 MainActivity.kt로 이동*/
        binding.loginButton.setOnClickListener{
            intent1=Intent(this,MainActivity::class.java)
            login()
        }
* */


class Sos: AppCompatActivity() {
    lateinit var binding: ActivitySosBinding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.familysos.setOnClickListener{
            val intent1=Intent(this,Sos::class.java)
        }

        binding.imageButton3.setOnClickListener{
            val intent1=Intent(this,MainActivity::class.java)
        }


    }
}

