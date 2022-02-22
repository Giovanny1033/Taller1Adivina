package com.example.talleradivinaelnum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var entradaTexto = findViewById<EditText>(R.id.editText)

    var entradaInt = entradaTexto.text.toString().toInt()

    if(entradaInt > num) {
        //El numero aleatorio es menor
        Toast.makeText(this, "El numero aleatorio es menor", Toast.LENGTH_SHORT).show()
    } else {
        //El numero aleatorio es mayor
        Toast.makeText(this, "El numero aleatorio es mayor", Toast.LENGTH_SHORT).show()
    }
}

}