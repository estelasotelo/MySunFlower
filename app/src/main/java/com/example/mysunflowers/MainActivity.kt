package com.example.mysunflowers

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

const val TEXTO = "TEXTO";


class MainActivity : AppCompatActivity() {
    lateinit var button: Button;
    lateinit var acceder: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button_texto);
        acceder = findViewById(R.id.button_mensaje);

        button.setOnClickListener {
            if (button.text != "Soy Azul") {
                button.setBackgroundColor(Color.parseColor("#6495ED"));
                button.setText("Soy Azul");
            } else {
                button.setBackgroundColor(Color.parseColor("#FF0000"));
                button.setText("Soy Rojo");
            }
        }
        acceder.setOnClickListener { changeActivity(it) };
    }

    fun changeActivity(View: View) {
        var editText = findViewById<EditText>(R.id.Campo_de_texto);
        var mensaje = editText.text.toString();
        val intent = Intent(this, AcrividadDos::class.java).apply {
            putExtra(TEXTO, mensaje)
        }
        startActivity(intent);
    }
}