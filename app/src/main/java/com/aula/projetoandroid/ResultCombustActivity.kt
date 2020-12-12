package com.aula.projetoandroid

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class ResultCombustActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_combust)
        setSupportActionBar(findViewById(R.id.layout))

        val intent = intent
        if(intent != null) {
            val gasolina = intent.getStringExtra("valorGasolina")
          val alcool = intent.getStringExtra("valorAlcool")

            val calculo = gasolina * 0.7

            if (calculo > alcool) {
                resultado.text = "Alcool é melhor"
            } else {
                resultado.text = "Gasolina é melhor"
            }
        }

    }
}