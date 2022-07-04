package com.thundersoda.samplemvp.stories.list.view;

import com.thundersoda.samplemvp.model.Pokemon;

import java.util.List;

public interface MainActivityView {

    void showDataInRecyclerView(List<Pokemon> pokemons);
    void hideProgressBar();
}
