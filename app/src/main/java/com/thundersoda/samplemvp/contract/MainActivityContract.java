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
        void setDataInRecyclerView(List<Pokemon> pokemons);
    }

    interface Model {
        interface OnFinishedListener {

            // en el OnSuccess se llama al método para car
            void OnSuccessRequest(List<Pokemon> pokemons);
            void OnErrorRequest(String errorMessage);
        }

        //se espera respuesta del listener para obtener la lista
        void getListOfPokemons(OnFinishedListener onFinishedListener);
    }
}
