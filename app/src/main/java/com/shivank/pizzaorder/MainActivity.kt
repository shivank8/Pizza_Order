package com.shivank.pizzaorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var btnDisplay:Button
    lateinit var checkBox: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDisplay=findViewById(R.id.btnDisplay)
        checkBox=findViewById(R.id.checkBox)
        btnDisplay.setOnClickListener{
            if(checkBox.isChecked) {
                val intent = Intent(this, ListPizzaActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Please agree terms of condition", Toast.LENGTH_SHORT).show()
            }

        }
    }
}