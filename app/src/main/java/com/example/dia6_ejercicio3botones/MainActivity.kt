package com.example.dia6_ejercicio3botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val botonA = findViewById<Button>(R.id.boton1)
    val botonB = findViewById<Button>(R.id.boton2)
    val botonC = findViewById<Button>(R.id.boton3)

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        botonA.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?){
                accionUno()
            }

        })


    }

    private fun accionUno(){
        println("accion uno")

    }


}