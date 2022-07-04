package com.thundersoda.samplemvp;

import com.thundersoda.samplemvp.stories.list.model.PokemonRepository;
import com.thundersoda.samplemvp.stories.list.model.PokemonRepositoryImpl;
import com.thundersoda.samplemvp.stories.list.presenter.MainActivityPresenter;
import com.thundersoda.samplemvp.stories.list.presenter.MainActivityPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    public MainActivityPresenter providesMainActivityPresenter(PokemonRepository pokemonRepository) {
        return new MainActivityPresenterImpl(pokemonRepository);
    }

    @Provides
    public PokemonRepository providesPokemonRepository() {
        return new PokemonRepositoryImpl();
    }
}
