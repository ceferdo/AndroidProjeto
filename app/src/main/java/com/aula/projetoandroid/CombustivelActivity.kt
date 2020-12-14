package com.aula.projetoandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_combustivel.*

class CombustivelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combustivel)

        combustCalculo.setOnClickListener {
            val intent = Intent(this@CombustivelActivity, ResultCombustActivity::class.java)
            intent.putExtra("gasolina", valorGasolina.text.toString())
            intent.putExtra("alcool", valorAlcool.text.toString())
            startActivity(intent)
        }
    }
}