package com.example.kotlin_workshop.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_workshop.R
import com.example.kotlin_workshop.data.Pokemon
import com.squareup.picasso.Picasso

class PokemonListAdapter : RecyclerView.Adapter<PokemonViewHolder>() {
    private var pokemonList = arrayListOf<Pokemon>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return PokemonViewHolder(view)
    }

    override fun getItemCount() = pokemonList.size

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon = pokemonList[position]
        holder.nameView.text = pokemon.name
        Picasso.get().load(pokemon.sprites.front_default).into(holder.imageView)
    }

    fun setPokemons(list: List<Pokemon>) {
        pokemonList.addAll(list)

        // notifies the recycler view, warning that the data has changed, so that the visual components are drawn again
        notifyDataSetChanged()
    }
}