package com.example.a22sw_yeongchayeongcha


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a22sw_yeongchayeongcha.databinding.ActivityMainBinding
import com.google.android.libraries.maps.MapView


class MainActivity: AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var intent1: Intent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapView = MapView(this)
        binding.kakaoMapView.addView(mapView)

        binding.familysos.setOnClickListener{
            val intent1=Intent(this,My::class.java)
        }
    }


}

/*

mport androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kakao_map.*
import net.daum.mf.map.api.MapView

class KakaoMapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kakao_map)

        val mapView = MapView(this)
        kakaoMapView.addView(mapView)
    }
}
       */