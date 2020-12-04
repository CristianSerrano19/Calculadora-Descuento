package com.example.procencalul

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

import android.view.View as View1

class Calculando_Descuento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculando__descuento)

        val precioP=findViewById<View1>(R.id.txtProducto) as EditText
        val descuento=findViewById<View1>(R.id.txtPorcentaje) as EditText
        val calcular=findViewById<Button>(R.id.btnCalcular) as Button
        var txtTotal=findViewById<TextView>(R.id.txtTotal) as TextView
        var txt=findViewById<TextView>(R.id.textView3) as TextView
        var imagen=findViewById<ImageView>(R.id.imageView4) as ImageView
        calcular.setOnClickListener(android.view.View.OnClickListener {

            var porcentaje: Double = 0.0
            porcentaje = descuento.text.toString().toDouble()/100

            var descu: Double = 0.0
            descu = precioP.text.toString().toDouble() * porcentaje.toString().toDouble()

            var total_d: Double = 0.0
            total_d =  precioP.text.toString().toDouble() - descu.toString().toDouble()

            txtTotal.text = total_d.toString()

            txtTotal.setVisibility(View1.VISIBLE)
            txt.setVisibility(View1.VISIBLE)
            imagen.setVisibility(View1.VISIBLE)

        })
    }
}