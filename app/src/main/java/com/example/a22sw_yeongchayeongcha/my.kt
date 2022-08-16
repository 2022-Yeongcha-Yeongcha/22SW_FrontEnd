package com.example.a22sw_yeongchayeongcha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityMyBinding


class My: AppCompatActivity() {
    lateinit var binding: ActivityMyBinding
    lateinit var intent1: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView19.setOnClickListener{
            val intent=Intent(this,My::class.java)
        }

        binding.imageButton12.setOnClickListener{
            val intent=Intent(this,Login::class.java)
        }

        binding.imageButton.setOnClickListener{
            val intent=Intent(this,Familycheck::class.java)
        }

        binding.imageButton7.setOnClickListener{
            val intent=Intent(this,Family1::class.java)
        }

        binding.imageButton8.setOnClickListener{
            val intent=Intent(this,Sos::class.java)
        }

    }
}