package com.salsabilazahrasarwo.klinikapp_mi2c

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.salsabilazahrasarwo.klinikapp_mi2c.screen.HomeDoctors

class PageLogin : AppCompatActivity() {

    private lateinit var txtsign: TextView
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)

        txtsign = findViewById(R.id.txtsign)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener() {
            val intent = Intent(this, HomeDoctors::class.java)
            startActivity(intent)
        }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }

    }
}