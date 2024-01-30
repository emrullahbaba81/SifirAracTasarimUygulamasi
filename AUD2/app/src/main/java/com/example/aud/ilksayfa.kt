package com.example.aud

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.TextView

class ilksayfa : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ilksayfa)

        var bar = findViewById<ProgressBar>(R.id.progressBar)
        var buton = findViewById<Button>(R.id.buton)
        var ltfn = findViewById<TextView>(R.id.textView)
        var res1 = findViewById<ImageView>(R.id.imageView2)
        var res2 = findViewById<ImageView>(R.id.imageView3)
        var res3 = findViewById<ImageView>(R.id.imageView4)
        var res4 = findViewById<ImageView>(R.id.imageView5)
        var res5 = findViewById<ImageView>(R.id.imageView6)
        var a3 = findViewById<RadioButton>(R.id.radioButton6)
        var a4 = findViewById<RadioButton>(R.id.radioButton8)
        var a5 = findViewById<RadioButton>(R.id.radioButton9)
        var a6 = findViewById<RadioButton>(R.id.radioButton10)
        var a7 = findViewById<RadioButton>(R.id.radioButton11)


        res1.visibility =View.INVISIBLE
        res2.visibility =View.INVISIBLE
        res3.visibility =View.INVISIBLE
        res4.visibility =View.INVISIBLE
        res5.visibility =View.INVISIBLE
        a3.visibility =View.INVISIBLE
        a4.visibility =View.INVISIBLE
        a5.visibility =View.INVISIBLE
        a6.visibility =View.INVISIBLE
        a7.visibility =View.INVISIBLE
        ltfn.visibility = View.INVISIBLE
        bar.visibility = View.INVISIBLE

        buton.setOnClickListener{
            res1.visibility = View.VISIBLE
            res2.visibility = View.VISIBLE
            res3.visibility = View.VISIBLE
            res4.visibility = View.VISIBLE
            res5.visibility = View.VISIBLE
            a3.visibility = View.VISIBLE
            a4.visibility = View.VISIBLE
            a5.visibility = View.VISIBLE
            a6.visibility = View.VISIBLE
            a7.visibility = View.VISIBLE

        }

        a3.setOnClickListener{
            Handler().postDelayed({
                var gecis = Intent(this,a3tasarim::class.java)
                startActivity(gecis)
                finish()
            },1000)
            ltfn.visibility = View.VISIBLE
            bar.visibility = View.VISIBLE
        }
        a4.setOnClickListener{
            Handler().postDelayed({
                var gecis = Intent(this,a4tasarim::class.java)
                startActivity(gecis)
                finish()
            },1000)
            ltfn.visibility = View.VISIBLE
            bar.visibility = View.VISIBLE
        }
        a5.setOnClickListener{
            Handler().postDelayed({
                var gecis = Intent(this,a5tasarim::class.java)
                startActivity(gecis)
                finish()
            },1000)
            ltfn.visibility = View.VISIBLE
            bar.visibility = View.VISIBLE
        }
        a6.setOnClickListener{
          Handler().postDelayed({
              var gecis = Intent(this,a6tasarim::class.java)
               startActivity(gecis)
                finish()
            },1000)
            ltfn.visibility = View.VISIBLE
            bar.visibility = View.VISIBLE
        }
        a7.setOnClickListener{
           Handler().postDelayed({
              var gecis = Intent(this,a7tasarim::class.java)
               startActivity(gecis)
                finish()
            },1000)
            ltfn.visibility = View.VISIBLE
            bar.visibility = View.VISIBLE
        }



    }
}