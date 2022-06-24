package com.thundersoda.samplemvp.networking;

import com.thundersoda.samplemvp.model.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Endpoints {

    String BASE_URL = "https://api.pokemontcg.io/v2/";

    @GET("cards?subtype=Basic")
    Call<PokemonResponse> getPokemonList();
}
