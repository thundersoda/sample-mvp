package com.thundersoda.samplemvp.stories.list.view;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.thundersoda.samplemvp.R;
import com.thundersoda.samplemvp.adapter.PokemonAdapter;
import com.thundersoda.samplemvp.dagger.App;
import com.thundersoda.samplemvp.model.Pokemon;
import com.thundersoda.samplemvp.stories.list.presenter.MainActivityPresenter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityView {
    PokemonAdapter pokemonAdapter;
    List<Pokemon> pkmnList;
    RecyclerView pokemonRecycler;

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);
        pkmnList = new ArrayList<>();

        setUpToolbar();
        setUpElements();
        setUpPresenter();
    }

    public void setUpToolbar() {
        Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setTitle("Pokemon List");
    }

    public void setUpElements() {
        pokemonRecycler = findViewById(R.id.pokemon_recycler_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        pokemonRecycler.setLayoutManager(linearLayoutManager);
        pokemonRecycler.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    public void setUpPresenter() {
        presenter.requestPokemonListService();
    }

    @Override
    public void showDataInRecyclerView(List<Pokemon> pokemons) {
        pkmnList.addAll(pokemons);
        pokemonAdapter = new PokemonAdapter(pkmnList, this);
        pokemonRecycler.setAdapter(pokemonAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
    }
}