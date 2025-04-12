package com.example.calci_x

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
            val reultTV = findViewById<TextView>(R.id.result_tv)
            val solutionTV = findViewById<TextView>(R.id.solution_tv)

            val buttonc = findViewById<MaterialButton>(R.id.button_clear)
            val buttonac = findViewById<MaterialButton>(R.id.button_allclear)

            val buttonrightbracket = findViewById<MaterialButton>(R.id.button_rightbracket)
            val buttonleftbracket = findViewById<MaterialButton>(R.id.button_leftbracket)
            val buttondivide = findViewById<MaterialButton>(R.id.button_Divide)
            val buttonmultiply = findViewById<MaterialButton>(R.id.button_multiply)
            val buttonsubstract = findViewById<MaterialButton>(R.id.button_substract)
            val buttonadd = findViewById<MaterialButton>(R.id.button_Add)
            val buttonequal = findViewById<MaterialButton>(R.id.button_equal)
            val buttonzero = findViewById<MaterialButton>(R.id.button_zero)
            val buttonone = findViewById<MaterialButton>(R.id.button_one)
            val buttontwo = findViewById<MaterialButton>(R.id.button_Two)
            val buttonthree = findViewById<MaterialButton>(R.id.button_three)
            val buttonfour = findViewById<MaterialButton>(R.id.button_four)
            val buttonfive = findViewById<MaterialButton>(R.id.button_five)
            val buttonsix = findViewById<MaterialButton>(R.id.button_six)
            val buttonseven = findViewById<MaterialButton>(R.id.button_seven)
            val buttoneight = findViewById<MaterialButton>(R.id.button_eight)
            val buttonnine = findViewById<MaterialButton>(R.id.button_nine)
            val buttonpoint = findViewById<MaterialButton>(R.id.button_dot)


        }

         fun onButtonClick(view: View){
            val button=view as MaterialButton
            val buttonText=button.text.toString()
             val solutionTV = findViewById<TextView>(R.id.solution_tv)
             solutionTV.append(buttonText)
        }
    }
}