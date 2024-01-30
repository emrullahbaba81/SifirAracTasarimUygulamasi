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

class a6tasarim : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a6tasarim)

        var yazi = findViewById<TextView>(R.id.textView6)
        var yazi2 = findViewById<TextView>(R.id.textView9)
        var res1 = findViewById<ImageView>(R.id.imageView12)
        var res2 = findViewById<ImageView>(R.id.imageView13)
        var box1 = findViewById<CheckBox>(R.id.checkBox15)
        var box2 = findViewById<CheckBox>(R.id.checkBox16)
        var box3 = findViewById<CheckBox>(R.id.checkBox17)
        var box4 = findViewById<CheckBox>(R.id.checkBox18)

        var buton = findViewById<Button>(R.id.button7)
        var buton2 = findViewById<Button>(R.id.button8)

        buton.setOnClickListener{
            Handler().postDelayed({
                var gecis = Intent(this,ilksayfa::class.java)
                startActivity(gecis)
                finish()
            },1000)


        }
        buton2.setOnClickListener{
            Handler().postDelayed({
                var gecis = Intent(this,icdizayn::class.java)
                startActivity(gecis)
                finish()
            },1000)


        }




    }
}