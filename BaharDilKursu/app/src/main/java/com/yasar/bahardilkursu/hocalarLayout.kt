package com.yasar.bahardilkursu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class hocalarLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hocalar_layout)
    }

    public fun bunyaminhoca(view:View){
        val intent=Intent(applicationContext,bunyaminHoca::class.java)
        startActivity(intent)
    }
}