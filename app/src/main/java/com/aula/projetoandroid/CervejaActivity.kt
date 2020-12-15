package com.aula.projetoandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cerveja.*

class CervejaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerveja)

        var contagem = 0

        var resultado = 0.0
        btnMais.setOnClickListener {
            contagem += 1
            txtContador.text = contagem.toString()
        }

        btnMenos.setOnClickListener {
            if (contagem > 0) {
                contagem -= 1
                txtContador.text = contagem.toString()
            } else {
                contagem = 0
                txtContador.text = contagem.toString()
            }
        }
        if(precoCerveja.text.toString() != "") {
            btnCalcular.setOnClickListener {
                if(cbxPorcentagem.isChecked) {
                    resultado = precoCerveja.text.toString().toDouble() * contagem * 1.1
                    txtResultConta.text = resultado.toString()
                }
                else {
                    resultado = precoCerveja.text.toString().toDouble() * contagem
                    txtResultConta.text = resultado.toString()
                }
            }
        } else {
            Toast.makeText(this@CervejaActivity, "Digitar o preço da Cerveja", Toast.LENGTH_LONG).show();
        }

        btnResetarValores.setOnClickListener {
            txtResultConta.text.toString()
        }

        btnMenuPrincipal.setOnClickListener {
            var intent = Intent(this@CervejaActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}