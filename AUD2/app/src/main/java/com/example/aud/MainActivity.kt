package com.example.aud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var logo =findViewById<ImageView>(R.id.logo);

        Handler().postDelayed({
            var gecis = Intent(this,ilksayfa::class.java)
            startActivity(gecis)
            finish()
        },2000)
    }
}