package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.PokemonDto;
import com.pokemonreview.api.dto.PokemonResponse;

import java.util.List;

public interface PokemonService {
    PokemonDto createPokemon(PokemonDto pokemonDto);
    PokemonResponse getAllPokemons(int pageNumber, int pageSize);

    PokemonDto getPokemonById(long id);

    PokemonDto updatePokemon(PokemonDto pokemonDto, long id);

    void deletePokemon(long id);
}
