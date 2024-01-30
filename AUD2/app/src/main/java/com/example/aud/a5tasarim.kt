package com.example.aud

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView

class a5tasarim : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a5tasarim)

        var yazi = findViewById<TextView>(R.id.textView7)
        var yazi2 = findViewById<TextView>(R.id.textView8)
        var res1 = findViewById<ImageView>(R.id.imageView10)
        var res2 = findViewById<ImageView>(R.id.imageView11)
        var box1 = findViewById<CheckBox>(R.id.checkBox11)
        var box2 = findViewById<CheckBox>(R.id.checkBox12)
        var box3 = findViewById<CheckBox>(R.id.checkBox13)
        var box4 = findViewById<CheckBox>(R.id.checkBox14)

        var buton = findViewById<Button>(R.id.button5)
        var buton2 = findViewById<Button>(R.id.button6)


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