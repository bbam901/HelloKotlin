package com.example.hellokotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding);

        val heightField = findViewById<EditText>(R.id.heightField)
        val weightField = findViewById<EditText>(R.id.weightField)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val btnBmi = findViewById<Button>(R.id.btnBmi)

        btnBmi.setOnClickListener {
            try{
                val Height = heightField.getText().toString().toDouble()
                val Weight = weightField.getText().toString().toDouble()

                val bmi = Weight / Math.pow(Height / 100.0, 2.0)

                txtResult.setText("Your BMI = " + bmi)
            } catch (e : Exception){
                txtResult.setText("Input(s) missing")

            }
        }
    }
}