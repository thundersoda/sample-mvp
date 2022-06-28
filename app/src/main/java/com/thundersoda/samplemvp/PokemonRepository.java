package com.thundersoda.samplemvp;

import android.util.Log;

import com.thundersoda.samplemvp.contract.MainActivityContract;
import com.thundersoda.samplemvp.model.Pokemon;
import com.thundersoda.samplemvp.model.PokemonResponse;
import com.thundersoda.samplemvp.networking.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PokemonRepository implements MainActivityContract.Model {
    List<Pokemon> pokemons;

    @Override
    public void getListOfPokemons(OnFinishedListener onFinishedListener) {
        Call<PokemonResponse> call = ApiClient.buildApi().getPokemonList();
        call.enqueue(new Callback<PokemonResponse>() {
            @Override
            public void onResponse(Call<PokemonResponse> call, Response<PokemonResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    PokemonResponse pokemonList = response.body();
                    pokemons = pokemonList.getData();

                    //Pasamos la respuesta del servicio al OnSuccessRequest
                    onFinishedListener.OnSuccessRequest(pokemons);
                }
            }

            @Override
            public void onFailure(Call<PokemonResponse> call, Throwable t) {
                onFinishedListener.OnErrorRequest(t.getMessage());
            }
        });
    }
}
