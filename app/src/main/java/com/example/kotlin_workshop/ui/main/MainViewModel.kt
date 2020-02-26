package com.example.kotlin_workshop.ui.main

import androidx.lifecycle.ViewModel
import com.example.kotlin_workshop.data.Pokemon
import com.example.kotlin_workshop.data.PokemonSprite

class MainViewModel : ViewModel() {
    fun getPokemons() : List<Pokemon> {
        var pokemon1 = Pokemon(
            name = "pokemon1",
            order = 1,
            sprites = PokemonSprite(
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png"
            )
        )
        var pokemon2 = Pokemon(
            name = "pokemon2",
            order = 1,
            sprites = PokemonSprite(
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png"
            )
        )
        var pokemon3 = Pokemon(
            name = "pokemon3",
            order = 1,
            sprites = PokemonSprite(
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png"
            )
        )
        var pokemon4 = Pokemon(
            name = "pokemon4",
            order = 1,
            sprites = PokemonSprite(
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png"
            )
        )
        var pokemon5 = Pokemon(
            name = "pokemon5",
            order = 1,
            sprites = PokemonSprite(
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png"
            )
        )

        var list = arrayListOf<Pokemon>()

        list.add(pokemon1)
        list.add(pokemon2)
        list.add(pokemon3)
        list.add(pokemon4)
        list.add(pokemon5)

        return list
    }
}