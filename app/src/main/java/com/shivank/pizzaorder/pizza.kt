package com.shivank.pizzaorder

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class pizza(val context: Context,val pizzaList:ArrayList<String>) :RecyclerView.Adapter<pizza.pizzaHolder>(){

    class pizzaHolder(view: View): RecyclerView.ViewHolder(view){
        val pizzaDetails:TextView=view.findViewById(R.id.pizzaDetails)
        val llPizzaItem:LinearLayout=view.findViewById(R.id.llPizzaItem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pizzaHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.pizza_single_row,parent,false)

        return pizzaHolder(view)
    }

    override fun onBindViewHolder(holder: pizzaHolder, position: Int) {
        val text=pizzaList[position]
        holder.pizzaDetails.text=text
        holder.llPizzaItem.setOnClickListener{
            val intent=Intent(context,PizzaPriceActivity::class.java)
            intent.putExtra("pizzaSelected",text)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return pizzaList.size

    }
}