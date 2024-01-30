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

class a7tasarim : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a7tasarim)

        var yazi = findViewById<TextView>(R.id.textView10)
        var yazi2 = findViewById<TextView>(R.id.textView11)
        var res1 = findViewById<ImageView>(R.id.imageView14)
        var box1 = findViewById<CheckBox>(R.id.checkBox19)
        var box2 = findViewById<CheckBox>(R.id.checkBox20)

        var buton = findViewById<Button>(R.id.button9)
        var buton2 = findViewById<Button>(R.id.button10)


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