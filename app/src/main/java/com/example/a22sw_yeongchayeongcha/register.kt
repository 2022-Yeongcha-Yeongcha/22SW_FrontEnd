package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityRegisterBinding
class Register: AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerFinishBtn.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
        }

        binding.imageView2.setOnClickListener{
            val intent=Intent(this,Login::class.java)
        }



    }
}