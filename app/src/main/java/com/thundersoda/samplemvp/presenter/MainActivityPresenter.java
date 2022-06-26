package com.thundersoda.samplemvp.presenter;

import com.thundersoda.samplemvp.contract.MainActivityContract;
import com.thundersoda.samplemvp.model.Pokemon;

import java.util.List;

public class MainActivityPresenter implements MainActivityContract.Presenter, MainActivityContract.Model.OnFinishedListener {
    MainActivityContract.View view;
    MainActivityContract.Model model;

    public MainActivityPresenter(MainActivityContract.View view, MainActivityContract.Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void RequestPokemonListService() {
        model.getListOfPokemons(this);
    }

    @Override
    public void OnSuccessRequest(List<Pokemon> pokemons) {
        //view.showDataInRecyclerView(pokemons);
    }

    @Override
    public void OnErrorRequest(String errorMessage) {

    }
}
