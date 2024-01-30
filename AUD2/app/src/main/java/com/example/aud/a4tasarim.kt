package com.example.aud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

class a4tasarim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a4tasarim)

        var donanimyazi = findViewById<TextView>(R.id.textView4)
        var donanimyazi2 = findViewById<TextView>(R.id.textView5)
        var a4advanced = findViewById<ImageView>(R.id.imageView)
        var a4sline = findViewById<ImageView>(R.id.imageView9)

        var a4advancedbox = findViewById<CheckBox>(R.id.checkBox6)
        var a4slinebox = findViewById<CheckBox>(R.id.checkBox7)
        var a4dinamik = findViewById<CheckBox>(R.id.checkBox8)
        var a4konfor = findViewById<CheckBox>(R.id.checkBox9)
        var a4premium = findViewById<CheckBox>(R.id.checkBox10)
        var geributon = findViewById<Button>(R.id.button4)
        var ileributon = findViewById<Button>(R.id.button3)

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