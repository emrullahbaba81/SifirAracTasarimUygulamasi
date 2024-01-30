package com.example.aud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class siparisver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siparisver)

        var siparisbuton= findViewById<Button>(R.id.button13)
        var cıkısbuton= findViewById<Button>(R.id.button14)
        var degerlendirme = findViewById<TextView>(R.id.textView15)
        var bar = findViewById<RatingBar>(R.id.ratingBar)

        siparisbuton.setOnClickListener{

            var mesaj = AlertDialog.Builder(this@siparisver)
            mesaj.setTitle("Uyari !")
            mesaj.setMessage("Emin misiniz?")
            mesaj.setIcon(R.drawable.logo)
            mesaj.setCancelable(false)
            mesaj.setPositiveButton("EVET"){DialogInterface,i->
                Toast.makeText(applicationContext,"Siparişiniz verilmiştir.Hayırlı olsun :)", Toast.LENGTH_SHORT).show()
            }
            mesaj.setNeutralButton("HAYIR"){DialogInterface, i->
                Toast.makeText(applicationContext,"Kontrol ediniz !!!", Toast.LENGTH_SHORT).show()
            }
            mesaj.create().show()
        }

        cıkısbuton.setOnClickListener {
            var mesaj = AlertDialog.Builder(this@siparisver)
            mesaj.setTitle("Uyari !")
            mesaj.setMessage("Emin misiniz?")
            mesaj.setIcon(R.drawable.logo)
            mesaj.setCancelable(false)
            mesaj.setPositiveButton("EVET"){DialogInterface,i->
                System.exit(0)
            }
            mesaj.setNeutralButton("HAYIR"){DialogInterface, i->
            }
            mesaj.create().show()

        }



        }

    }
//}