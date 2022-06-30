package com.thundersoda.samplemvp.stories.list.presenter;

import com.thundersoda.samplemvp.stories.list.model.PokemonRepositoryImpl;
import com.thundersoda.samplemvp.model.Pokemon;
import com.thundersoda.samplemvp.stories.list.view.MainActivityView;

import java.util.List;

public class MainActivityPresenterImpl implements MainActivityPresenter {
    MainActivityView view;
    PokemonRepositoryImpl pokemonRepository;

    public MainActivityPresenterImpl(MainActivityView view) {
        this.view = view;
        this.pokemonRepository = new PokemonRepositoryImpl();
    }

    @Override
    public void RequestPokemonListService() {
        pokemonRepository.getListOfPokemons(new PokemonRepositoryImpl.OnFinishedListener() {
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
