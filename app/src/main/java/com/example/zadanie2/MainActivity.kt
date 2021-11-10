package com.example.zadanie2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wyslane = findViewById<Button>(R.id.wyslij)
        val do_podania_imie = findViewById<TextInputEditText>(R.id.podane_imie)
        val do_podania_nazwisko = findViewById<TextInputEditText>(R.id.podane_nazwisko)
        val tekst_wynik = findViewById<TextView>(R.id.Wynik)
        val dospr = findViewById<TextView>(R.id.dospr)
        val dospr2 = findViewById<TextView>(R.id.dospr2)



        wyslane.setOnClickListener {
            dospr.text = do_podania_imie.text.toString()
            dospr2.text = do_podania_nazwisko.text.toString()
            if (dospr.text == "")
            {
                tekst_wynik.text = "Wypełnij wszystkie pola"
            }
            else if (dospr2.text == "") {
                tekst_wynik.text = "Wypełnij wszystkie pola"
            }
            else
            {
                val podane_imie = do_podania_imie.text.toString()
                val podane_nazwisko = do_podania_nazwisko.text.toString()
                tekst_wynik.text = "Podane Imie: " + podane_imie + "   Podane Nazwisko: " + podane_nazwisko
            }
        }
    }

}
