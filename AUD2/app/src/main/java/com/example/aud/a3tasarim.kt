package com.example.aud

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

class a3tasarim : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a3tasarim)

        var yazi = findViewById<TextView>(R.id.textView2)
        var advanced = findViewById<ImageView>(R.id.imageView7)
        var sline = findViewById<ImageView>(R.id.imageView8)
        var advancedbox = findViewById<CheckBox>(R.id.checkBox)
        var slinebox = findViewById<CheckBox>(R.id.checkBox2)

        var paketyazi = findViewById<TextView>(R.id.textView3)
        var dinamik = findViewById<CheckBox>(R.id.checkBox3)
        var konfor = findViewById<CheckBox>(R.id.checkBox4)
        var premium = findViewById<CheckBox>(R.id.checkBox5)
        var geributon = findViewById<Button>(R.id.button2)
        var ileributon = findViewById<Button>(R.id.button)

        geributon.setOnClickListener{
            Handler().postDelayed({
                var gecis = Intent(this,ilksayfa::class.java)
                startActivity(gecis)
                finish()
            },1000)
        }

        ileributon.setOnClickListener{
            Handler().postDelayed({
                var gecis = Intent(this,icdizayn::class.java)
                startActivity(gecis)
                finish()
            },1000)
        }



    }
}