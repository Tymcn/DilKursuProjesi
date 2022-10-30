package com.yasar.bahardilkursu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class girisLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giris_layout)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater=menuInflater
        menuInflater.inflate(R.menu.menudetay,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.anamenu){
            val intent = Intent(applicationContext,girisLayout::class.java)
            Toast.makeText(
                this, "BAŞARILI BİR ŞEKİLDE GİRİŞ YAPILIYOR",
                Toast.LENGTH_LONG
            ).show()
            startActivity(intent)
        }

        else if (item.itemId==R.id.derslermenu){
            val intent = Intent(applicationContext,derslerLayout::class.java)
            Toast.makeText(
                this, "BAŞARILI BİR ŞEKİLDE GİRİŞ YAPILIYOR",
                Toast.LENGTH_LONG
            ).show()
            startActivity(intent)
        }
        else if (item.itemId==R.id.hocalarmenu){
            val intent = Intent(applicationContext,hocalarLayout::class.java)
            Toast.makeText(
                this, "BAŞARILI BİR ŞEKİLDE GİRİŞ YAPILIYOR",
                Toast.LENGTH_LONG
            ).show()
            startActivity(intent)
        }
        else if (item.itemId==R.id.sınavlarmenu){
            val intent = Intent(applicationContext,sinavlarLayout::class.java)
            Toast.makeText(
                this, "BAŞARILI BİR ŞEKİLDE GİRİŞ YAPILIYOR",
                Toast.LENGTH_LONG
            ).show()
            startActivity(intent)

        }
        else if (item.itemId==R.id.yarismamenu){
            val intent = Intent(applicationContext,yarismaLayout::class.java)
            Toast.makeText(
                this, "BAŞARILI BİR ŞEKİLDE GİRİŞ YAPILIYOR",
                Toast.LENGTH_LONG
            ).show()
            startActivity(intent)

        }

        return super.onOptionsItemSelected(item)
    }

}