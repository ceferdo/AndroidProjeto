package com.aula.projetoandroid

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_combustivel.*
import kotlinx.android.synthetic.main.activity_result_combust.*

class ResultCombustActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_combust)

        val intent = intent
        if(intent != null) {
            val gasolina = intent.getStringExtra("gasolina")?.toDouble()
            val alcool = intent.getStringExtra("alcool")?.toDouble()

            val calculo = gasolina!!.times(0.7)

            if (calculo > alcool!!) {
                resultadoCombust.text = "Alcool é melhor"
            } else {
                resultadoCombust.text = "Gasolina é melhor"
            }
        }

        voltarMenu.setOnClickListener {
            val intent = Intent(this@ResultCombustActivity, MainActivity::class.java)
            startActivity(intent)

        }
    }
}