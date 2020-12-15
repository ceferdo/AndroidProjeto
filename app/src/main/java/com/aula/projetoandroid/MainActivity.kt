package com.aula.projetoandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        combustivel.setOnClickListener {
            val intent = Intent(this@MainActivity, CombustivelActivity::class.java)
            startActivity(intent)
        }

        cerveja.setOnClickListener {
            val intent = Intent(this@MainActivity, CervejaActivity::class.java)
            startActivity(intent)
        }
    }
}