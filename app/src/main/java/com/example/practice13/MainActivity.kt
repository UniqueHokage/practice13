package com.example.practice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnClick(view:View){
        val kurs: EditText = findViewById(R.id.editTextNumber)
        val summa: EditText = findViewById(R.id.editTextNumber2)
        val res: TextView = findViewById(R.id.textView3)
        val result: Double

        if (kurs.text.toString() == ""){
            val toast: Toast = Toast.makeText(baseContext, R.string.toast, Toast.LENGTH_SHORT)
            toast.show()
            kurs.requestFocus()
        }
    }
}