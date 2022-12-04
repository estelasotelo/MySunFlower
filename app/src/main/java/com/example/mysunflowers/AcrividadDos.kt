package com.example.mysunflowers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AcrividadDos : AppCompatActivity() {
    lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acrividad_dos)
            val mensaje = this.intent.getStringExtra(TEXTO).toString()

        textView= findViewById(R.id.Mensaje)
        textView.setText(mensaje)
    }
}