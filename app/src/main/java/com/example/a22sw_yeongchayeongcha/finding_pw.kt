package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityFindingPwBinding

class Finding_pw: AppCompatActivity() {
    lateinit var binding: ActivityFindingPwBinding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFindingPwBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.findPw.setOnClickListener{
            val intent=Intent(this,temporary_fragment::class.java)
        }

        binding.imageView2.setOnClickListener{
            val intent=Intent(this,Login::class.java)
        }





    }
}