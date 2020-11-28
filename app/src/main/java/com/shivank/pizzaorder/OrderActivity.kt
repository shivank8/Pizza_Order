package com.shivank.pizzaorder

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {
    lateinit var btnPlaceOrder: Button
    lateinit var radioGroup: RadioGroup
    lateinit var radioButton: RadioButton
    lateinit var choice:String
    lateinit var pizzaName:TextView
    lateinit var pizzaNamef:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        pizzaNamef= intent.getStringExtra("pizzaName").toString()
        btnPlaceOrder = findViewById(R.id.btnPlaceOrder)
        radioGroup = findViewById(R.id.radioGroup)
        pizzaName=findViewById(R.id.pizzaName)
        pizzaName.text=pizzaNamef
        var price=pizzaNamef.replace("[^0-9]".toRegex(), "")
        btnPlaceOrder.setOnClickListener {
            var radioId:Int=-1
            radioId= radioGroup.checkedRadioButtonId


            if (radioId!=-1) {
                radioButton=findViewById(radioId)

                choice= radioButton.text.toString()
                Toast.makeText(this, "You will pay $price using $choice", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Please fill the data", Toast.LENGTH_SHORT).show()
            }
        }
    }
}