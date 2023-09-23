package com.example.pc1_luis_arteaga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtEP:EditText=findViewById(R.id.etEP)
        val txtEF:EditText=findViewById(R.id.etEF)
        val txtPEP:EditText=findViewById(R.id.etPEP)
        val btnCalcular:Button=findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            var valueEP=txtEP.text.toString().toDouble()
            var valueEF=txtEF.text.toString().toDouble()
            var valuePEP=txtPEP.text.toString().toDouble()
            var promedio=valueEP*0.20+valueEF*0.20+valuePEP*0.60
            var promString:String= promedio.toString()
            intent= Intent(this,ResultActivity::class.java)
            intent.putExtra("param",promString)
            startActivity(intent)



        }


    }
}