package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityLoginBinding

class Login: AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
        }

        binding.registerBtn.setOnClickListener{
            val intent=Intent(this,Register::class.java)
        }

        binding.findPwBtn.setOnClickListener{
            val intent=Intent(this,Finding_pw::class.java)
        }





    }
}