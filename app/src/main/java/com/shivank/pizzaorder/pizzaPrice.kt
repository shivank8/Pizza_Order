package com.shivank.pizzaorder

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class pizzaPrice(val context: Context, val pizzaPrice: ArrayList<String>) : RecyclerView.Adapter<pizzaPrice.pizzaHolder>() {

    class pizzaHolder(view: View): RecyclerView.ViewHolder(view){
        val pizzaDetails:TextView=view.findViewById(R.id.pizzaDetailsPrice)
        val llPizzaItem:LinearLayout=view.findViewById(R.id.llPizzaItemPrice)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pizzaHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.pizza_single_price,parent,false)

        return pizzaHolder(view)
    }

    override fun onBindViewHolder(holder: pizzaHolder, position: Int) {
        val price=pizzaPrice[position]
        holder.pizzaDetails.text=price

        var pizzaName:String=pizzaSelected+" "+ price

        holder.llPizzaItem.setOnClickListener{
            val intent= Intent(context,OrderActivity::class.java)
            intent.putExtra("pizzaName",pizzaName)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return pizzaPrice.size
    }
}