package com.thundersoda.samplemvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.thundersoda.samplemvp.adapter.PokemonAdapter;
import com.thundersoda.samplemvp.contract.MainActivityContract;
import com.thundersoda.samplemvp.model.Pokemon;
import com.thundersoda.samplemvp.presenter.MainActivityPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {
    MainActivityPresenter presenter;
    PokemonAdapter pokemonAdapter;
    List<Pokemon> pkmnList;
    RecyclerView pokemonRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        presenter = new MainActivityPresenter(this, new PokemonRepository());
        presenter.RequestPokemonListService();
    }

    @Override
    public void showDataInRecyclerView(List<Pokemon> pokemons) {
        pkmnList.addAll(pokemons);
        pokemonAdapter = new PokemonAdapter(pkmnList, this);
        pokemonRecycler.setAdapter(pokemonAdapter);
    }
}