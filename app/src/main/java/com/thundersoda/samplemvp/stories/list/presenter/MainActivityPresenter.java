package com.thundersoda.samplemvp.stories.list.presenter;
import com.thundersoda.samplemvp.stories.list.view.MainActivityView;

public interface MainActivityPresenter {

    void requestPokemonListService();
    void setView(MainActivityView view);
}
