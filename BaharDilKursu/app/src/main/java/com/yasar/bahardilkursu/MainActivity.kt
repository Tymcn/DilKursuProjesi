package com.yasar.bahardilkursu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun girisYap(view: View) {
        var kAdi = kullaniciText.text.toString()
        var kSifre = passText.text.toString()
        if (kAdi == "yasar" && kSifre =="123") {
            val intent = Intent(applicationContext,girisLayout::class.java)
            Toast.makeText(
                this, "BAŞARILI BİR ŞEKİLDE GİRİŞ YAPILIYOR",
                Toast.LENGTH_LONG
            ).show()
            startActivity(intent)
        }
        else {
            Toast.makeText(
                this, "ŞİFRE VEYA KULLANICI ADI HATALI TEKRAR DENE",
                Toast.LENGTH_LONG
            ).show()
        }
    }


}