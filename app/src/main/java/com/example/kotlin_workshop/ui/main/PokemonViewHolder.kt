package com.example.kotlin_workshop.ui.main

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class PokemonViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
    val nameView : TextView
    val imageView : ImageView

    // called when any class constructor is called
    init {
        nameView = view.name
        imageView = view.image
    }
}