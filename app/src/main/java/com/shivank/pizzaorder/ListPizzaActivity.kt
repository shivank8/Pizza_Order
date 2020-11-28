package com.shivank.pizzaorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListPizzaActivity : AppCompatActivity() {
    lateinit var recyclerPizza: RecyclerView
    lateinit var layout: RecyclerView.LayoutManager

    val pizzaType= arrayListOf("Pepperoni","Vegetarian","Margherita")


    lateinit var pizzaAdapter:pizza

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pizza)
        recyclerPizza=findViewById(R.id.recyclerPizza)
        layout= LinearLayoutManager(this)

        pizzaAdapter= pizza(this,pizzaType )
        recyclerPizza.adapter=pizzaAdapter

        recyclerPizza.layoutManager=layout

    }
}