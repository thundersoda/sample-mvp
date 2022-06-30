package com.thundersoda.samplemvp.presenter;

import com.thundersoda.samplemvp.PokemonRepository;
import com.thundersoda.samplemvp.contract.MainActivityContract;
import com.thundersoda.samplemvp.model.Pokemon;

import java.util.List;

public class MainActivityPresenter implements MainActivityContract.Presenter {
    MainActivityContract.View view;
    PokemonRepository pokemonRepository;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
        this.pokemonRepository = new PokemonRepository();
    }

    @Override
    public void RequestPokemonListService() {
        pokemonRepository.getListOfPokemons(new PokemonRepository.OnFinishedListener() {
            @Override
            public void onSuccess(List<Pokemon> pokemon) {
                view.showDataInRecyclerView(pokemon);
            }

            @Override
            public void onFailure(String message) {

            }
        });
    }
}
