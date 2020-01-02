package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Timer().schedule(3000) {
            val intent = Intent(this@SplashActivity, HomeActivity::class.java)
            startActivity(intent)
        }

    }
//back button disable
    override fun onBackPressed() {
//        super.onBackPressed()
    }
}
