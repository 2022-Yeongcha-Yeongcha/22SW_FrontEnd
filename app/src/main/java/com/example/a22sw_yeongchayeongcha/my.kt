package com.example.a22sw_yeongchayeongcha

import android.content.ContentValues.TAG
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.widget.Toast
import com.example.a22sw_yeongchayeongcha.databinding.ActivityMyBinding
import java.security.MessageDigest


class My: AppCompatActivity() {

    private fun getAppKeyHash() {
        try {
            val info = packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
            for (signature in info.signatures) {
                val md: MessageDigest = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                val hashKey = String(Base64.encode(md.digest(), 0))
                Log.e(TAG, "해시키 : $hashKey")
            }
        } catch (e: Exception) {
            Log.e(TAG, "해시키를 찾을 수 없습니다 : $e")
        }
    }

    lateinit var binding: ActivityMyBinding

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

        binding.familysos.setOnClickListener{
            val intent=Intent(this,Sos::class.java)
        }

    }
}