package com.example.talleradivinaelnum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    var randomNumber = 0
    var attempts = 0

    var editText: EditText? = null
    var congrats: TextView? = null
    var reset: Button? = null
    var guess: Button? = null
    randomNumber = Random.nextInt(1,1000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        editText = findViewById<EditText>(R.id.editText)
        congrats = findViewById<TextView>(R.id.congrats)
        reset = findViewById<Button>(R.id.reset)
        guess = findViewById<Button>(R.id.guessButton)
    }

    fun guess(view: View){
        try {
            val enteredNumber = editText?.text.toString().toInt()

            attempts++
            congrats?.isVisible = true
            congrats?.text = "Intentos: $attempts"

            when {
                enteredNumber > randomNumber -> {
                    Toast.makeText(this, "El número aleatorio es menor", Toast.LENGTH_LONG).show()
                }
                enteredNumber < randomNumber -> {
                    Toast.makeText(this, "El número aleatorio es mayor", Toast.LENGTH_LONG).show()
                }
                else -> {
                    congrats?.text =
                        "Felicitaciones, has adivinado el número $randomNumber usando $attempts intentos"

                    editText?.isEnabled = false
                    view.isEnabled = false
                    reset?.inVisible = true
                }

                }
            } catch (e: Exception){
                Toast.makeText(this, "Ingresa un número", Toast.LENGTH_LONG).show()
            }
        }
        fun reset(view: View){
            reset?.isVisible = false
            congrats?.isVisible = false
            editText?.isEnable = true
            editText?.setText("")
            view.isEnabled = true
            attempts = 0
            randomNumber = Random.nextInt(0, 1000)
            guess?.isEnabled = true

        }
    }



//    var nAleatorio=(1..1000).random()
//    var numero=JOptionPane.showInputDialog("Adivina el numero que estoy pensando").toInt()
//    while (numero!=aleatorio)
//    {
//        var numero=JOptionPane.showInputDialog("Ese no es el numero, intentalo de nuevo").toInt()
//    }
//
//    var entradaTexto = findViewById<EditText>(R.id.editText)
//
//    var entradaInt = entradaTexto.text.toString().toInt()
//
//    if(entradaInt > num) {
//        //El numero aleatorio es menor
//        Toast.makeText(this, "El numero aleatorio es menor", Toast.LENGTH_SHORT).show()
//    } else {
//        //El numero aleatorio es mayor
//        Toast.makeText(this, "El numero aleatorio es mayor", Toast.LENGTH_SHORT).show()
//    }
//}

