package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityFamily3Binding


class Family3: AppCompatActivity() {
    lateinit var binding: ActivityFamily3Binding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFamily3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.family3okay.setOnClickListener{
            val intent=Intent(this,Familycheck::class.java)
        }

        binding.familysos.setOnClickListener{
            val intent=Intent(this,Sos::class.java)
        }


    }
}