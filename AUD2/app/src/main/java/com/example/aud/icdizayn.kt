package com.example.aud

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.*
import androidx.appcompat.app.AlertDialog

class icdizayn : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icdizayn)

        var yazi = findViewById<TextView>(R.id.textView12)
        var yazi2 = findViewById<TextView>(R.id.textView13)
        var yazi3 = findViewById<TextView>(R.id.textView14)

        var res1 = findViewById<ImageView>(R.id.imageView15)
        var res2 = findViewById<ImageView>(R.id.imageView16)
        var res3 = findViewById<ImageView>(R.id.imageView17)
        var res4 = findViewById<ImageView>(R.id.imageView18)
        var res5 = findViewById<ImageView>(R.id.imageView19)
        var res6 = findViewById<ImageView>(R.id.imageView20)
        var res7 = findViewById<ImageView>(R.id.imageView21)
        var res8 = findViewById<ImageView>(R.id.imageView22)

        var box = findViewById<CheckBox>(R.id.checkBox21)
        var box2 = findViewById<CheckBox>(R.id.checkBox22)

        var buton = findViewById<Button>(R.id.button11)
        var buton2 = findViewById<Button>(R.id.button12)

        buton.setOnClickListener {
            Handler().postDelayed({
                var gecis = Intent(this, a3tasarim::class.java)
                startActivity(gecis)
                finish()
            }, 1000)
        }
        buton2.setOnClickListener {
            Handler().postDelayed({
                var gecis = Intent(this, siparisver::class.java)
                startActivity(gecis)
                finish()
            }, 1000)
        }


        res1.setOnClickListener{
            var mesaj = AlertDialog.Builder(this@icdizayn)
            mesaj.setTitle("Uyari !")
            mesaj.setMessage("Beyaz Renk seçmek istediğinize emin misiniz?")
            mesaj.setIcon(R.drawable.a3)
            mesaj.setCancelable(false)
            mesaj.setPositiveButton("EVET"){DialogInterface,i->
                Toast.makeText(applicationContext,"Beyaz Renk Seçildi", Toast.LENGTH_SHORT).show()
            }
            mesaj.setNeutralButton("HAYIR"){DialogInterface, i->
            }
            mesaj.create().show()
        }

        res2.setOnClickListener{
            var mesaj = AlertDialog.Builder(this@icdizayn)
            mesaj.setTitle("Uyari !")
            mesaj.setMessage("Mavi Renk seçmek istediğinize emin misiniz?")
            mesaj.setIcon(R.drawable.a3)
            mesaj.setCancelable(false)
            mesaj.setPositiveButton("EVET"){DialogInterface,i->
                Toast.makeText(applicationContext,"Mavi Renk Seçildi", Toast.LENGTH_SHORT).show()
            }
            mesaj.setNeutralButton("HAYIR"){DialogInterface, i->
            }
            mesaj.create().show()
        }

        res3.setOnClickListener{
            var mesaj = AlertDialog.Builder(this@icdizayn)
            mesaj.setTitle("Uyari !")
            mesaj.setMessage("Siyah Renk seçmek istediğinize emin misiniz?")
            mesaj.setIcon(R.drawable.a3)
            mesaj.setCancelable(false)
            mesaj.setPositiveButton("EVET"){DialogInterface,i->
                Toast.makeText(applicationContext,"Siyah Renk Seçildi", Toast.LENGTH_SHORT).show()
            }
            mesaj.setNeutralButton("HAYIR"){DialogInterface, i->
            }
            mesaj.create().show()
        }

        res4.setOnClickListener{
            var mesaj = AlertDialog.Builder(this@icdizayn)
            mesaj.setTitle("Uyari !")
            mesaj.setMessage("Bu jantı seçmek istediğinize emin misiniz?")
            mesaj.setIcon(R.drawable.a3)
            mesaj.setCancelable(false)
            mesaj.setPositiveButton("EVET"){DialogInterface,i->
                Toast.makeText(applicationContext,"Bu jant Seçildi", Toast.LENGTH_SHORT).show()
            }
            mesaj.setNeutralButton("HAYIR"){DialogInterface, i->
            }
            mesaj.create().show()
        }

        res5.setOnClickListener{
            var mesaj = AlertDialog.Builder(this@icdizayn)
            mesaj.setTitle("Uyari !")
            mesaj.setMessage("Bu jantı seçmek istediğinize emin misiniz?")
            mesaj.setIcon(R.drawable.a3)
            mesaj.setCancelable(false)
            mesaj.setPositiveButton("EVET"){DialogInterface,i->
                Toast.makeText(applicationContext,"Bu jant Seçildi", Toast.LENGTH_SHORT).show()
            }
            mesaj.setNeutralButton("HAYIR"){DialogInterface, i->
            }
            mesaj.create().show()
        }

        res6.setOnClickListener{
            var mesaj = AlertDialog.Builder(this@icdizayn)
            mesaj.setTitle("Uyari !")
            mesaj.setMessage("Bu jantı seçmek istediğinize emin misiniz?")
            mesaj.setIcon(R.drawable.a3)
            mesaj.setCancelable(false)
            mesaj.setPositiveButton("EVET"){DialogInterface,i->
                Toast.makeText(applicationContext,"Bu jant Seçildi", Toast.LENGTH_SHORT).show()
            }
            mesaj.setNeutralButton("HAYIR"){DialogInterface, i->
            }
            mesaj.create().show()
        }




        }




}