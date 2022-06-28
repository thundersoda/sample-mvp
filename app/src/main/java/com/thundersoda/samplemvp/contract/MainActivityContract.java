package com.thundersoda.samplemvp.contract;

import com.thundersoda.samplemvp.model.Pokemon;

import java.util.List;

public interface MainActivityContract {

    interface Presenter {
        //Llamar al servicio para obtener la lista de pkmn
        void RequestPokemonListService();
    }

    interface View {
        //Metodo para cargar datos en el Recycler
        void showDataInRecyclerView(List<Pokemon> pokemons);
    }
}
