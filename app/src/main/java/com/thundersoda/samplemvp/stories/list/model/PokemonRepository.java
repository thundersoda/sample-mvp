package com.thundersoda.samplemvp.stories.list.model;

import com.thundersoda.samplemvp.model.Pokemon;

import java.util.List;

public interface PokemonRepository {

    interface OnFinishedListener {
        void onSuccess(List<Pokemon> pokemon);
        void onFailure(String message);
    }
}
