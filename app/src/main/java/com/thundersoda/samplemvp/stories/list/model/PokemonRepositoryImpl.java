package com.thundersoda.samplemvp.stories.list.model;

import com.thundersoda.samplemvp.model.PokemonResponse;
import com.thundersoda.samplemvp.networking.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PokemonRepositoryImpl implements PokemonRepository {

    @Override
    public void getListOfPokemons(OnFinishedListener onFinishedListener) {
        Call<PokemonResponse> call = ApiClient.buildApi().getPokemonList();
        call.enqueue(new Callback<PokemonResponse>() {
            @Override
            public void onResponse(Call<PokemonResponse> call, Response<PokemonResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    PokemonResponse pokemonList = response.body();

                    //Pasamos la respuesta del servicio al OnSuccessRequest
                    onFinishedListener.onSuccess(pokemonList.getData());
                } else {
                    onFinishedListener.onFailure(response.message());
                }
            }

            @Override
            public void onFailure(Call<PokemonResponse> call, Throwable t) {
                onFinishedListener.onFailure(t.getMessage());
            }
        });
    }
}
