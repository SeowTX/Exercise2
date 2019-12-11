package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        buttonCalculate.setOnClickListener() {
            totalBmi()
        }

        buttonReset.setOnClickListener(){
            onClear()
        }

    }


    fun totalBmi() {
        var image1 = findViewById<View>(R.id.imageViewProfile) as ImageView
        var input1 = findViewById<View>(R.id.editTextWeight) as EditText
        var input2 = findViewById<View>(R.id.editTextHeight) as EditText
        //var result1 = findViewById<View>(R.id.textViewBMI) as TextView
        var result1 = input1.text.toString().toDouble() / (input2.text.toString().toDouble() * input2.text.toString().toDouble())


        //result1.text = (input1.text.toString().toDouble() / (input2.text.toString().toDouble()* input2.text.toString().toDouble())).toString()

        if(result1 < 18.5){
            image1.setImageResource(R.drawable.under)
        }
        else if(result1 in 18.5..24.9){
            image1.setImageResource(R.drawable.normal)

        }
        else if(result1 >= 25){
            image1.setImageResource(R.drawable.over)
        }
    }

    fun onClear(){
        var image1 = findViewById<View>(R.id.imageViewProfile) as ImageView
        var input1 = findViewById<View>(R.id.editTextWeight) as EditText
        var input2 = findViewById<View>(R.id.editTextHeight) as EditText
        var textViewBMI =findViewById<View>(R.id.textViewBMI) as TextView

        image1.setImageResource(R.drawable.empty)
        input1.text.clear()
        input2.text.clear()
        textViewBMI.setText("BMI:")


    }

}

