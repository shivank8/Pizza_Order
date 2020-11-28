package com.shivank.pizzaorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
lateinit var pizzaSelected: String
class PizzaPriceActivity : AppCompatActivity() {
    lateinit var recyclerPizza: RecyclerView
    lateinit var layout: RecyclerView.LayoutManager


    val pizzaSize= arrayListOf("Normal 80000 LL","Extra 10000 LL","Special 150000 LL")


    lateinit var pizzaAdapter:pizzaPrice
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_price)

        pizzaSelected= intent.getStringExtra("pizzaSelected").toString()
        recyclerPizza=findViewById(R.id.recyclerPizzaPrice)
        layout= LinearLayoutManager(this)

        pizzaAdapter= pizzaPrice(this,pizzaSize )
        recyclerPizza.adapter=pizzaAdapter

        recyclerPizza.layoutManager=layout
    }
}