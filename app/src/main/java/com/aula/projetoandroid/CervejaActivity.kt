package com.aula.projetoandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cerveja.*

class CervejaActivity : AppCompatActivity() {

    var contagem = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cerveja)

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

        btnCalcular.setOnClickListener {
            if (precoCerveja.text.toString() != null) {
                if(cbxPorcentagem.isChecked) {
                    txtResultConta.text = "R$ " + String.format("%.2f", precoCerveja.text.toString().toDouble() * contagem * 1.1)
                }
                else {
                    txtResultConta.text = "R$ " + String.format("%.2f", precoCerveja.text.toString().toDouble() * contagem )
                }
            } else {
                Toast.makeText(this@CervejaActivity, "Digitar o preço da Cerveja", Toast.LENGTH_LONG).show();
            }

        }

        btnResetarValores.setOnClickListener {
            contagem = 0
            txtContador.text = contagem.toString()
            txtResultConta.text = "R$ - "
            precoCerveja.text = null
        }

        btnMenuPrincipal.setOnClickListener {
            var intent = Intent(this@CervejaActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}