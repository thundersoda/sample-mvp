package com.thundersoda.samplemvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thundersoda.samplemvp.contract.MainActivityContract;
import com.thundersoda.samplemvp.model.Pokemon;
import com.thundersoda.samplemvp.presenter.MainActivityPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpElements();
    }

    public void setUpElements() {
        presenter = new MainActivityPresenter(this, new ModelPokemon());
        presenter.RequestPokemonListService();
    }

    @Override
    public void showDataInRecyclerView(List<Pokemon> pokemons) {

    }
}