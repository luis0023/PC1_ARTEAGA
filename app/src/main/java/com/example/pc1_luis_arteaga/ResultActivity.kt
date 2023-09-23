package com.example.pc1_luis_arteaga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val promedio:TextView=findViewById(R.id.tvPromedio)
        val result:TextView=findViewById(R.id.tvResult)

        var valueProm:String?=intent.getStringExtra("param")
        promedio.text=valueProm


        """if (valueProm.toDouble() >= 10.5) {
            result.text="Aprobado"
        } else{
            result.text="Desaprobado"
        }"""




    }
}