package com.thundersoda.samplemvp.stories.list.presenter;

import com.thundersoda.samplemvp.stories.list.model.PokemonRepository;
import com.thundersoda.samplemvp.stories.list.model.PokemonRepositoryImpl;
import com.thundersoda.samplemvp.model.Pokemon;
import com.thundersoda.samplemvp.stories.list.view.MainActivityView;

import java.util.List;

public class MainActivityPresenterImpl implements MainActivityPresenter {
    MainActivityView view;
    PokemonRepository pokemonRepository;

    public MainActivityPresenterImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public void requestPokemonListService() {
        pokemonRepository.getListOfPokemons(new PokemonRepositoryImpl.OnFinishedListener() {
            @Override
            public void onSuccess(List<Pokemon> pokemon) {
                view.showDataInRecyclerView(pokemon);
                view.hideProgressBar();
            }

            @Override
            public void onFailure(String message) {
                view.hideProgressBar();
            }
        });
    }

    @Override
    public void setView(MainActivityView view) {
        this.view = view;
    }
}
