package com.thundersoda.samplemvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thundersoda.samplemvp.R;
import com.thundersoda.samplemvp.model.Pokemon;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder> {
    List<Pokemon> pokemonList;
    Context context;

    public PokemonAdapter(List<Pokemon> pokemonList, Context context) {
        this.pokemonList = pokemonList;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView pokemonName, pokemonSupertype, pokemonRarity;

        public ViewHolder(View view) {
            super(view);
            pokemonName = view.findViewById(R.id.pokemon_name);
            pokemonRarity = view.findViewById(R.id.pokemon_rarity);
            pokemonSupertype = view.findViewById(R.id.pokemon_supertype);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

        public TextView getPokemonName() {
            return pokemonName;
        }

        public TextView getPokemonSupertype() {
            return pokemonSupertype;
        }

        public TextView getPokemonRarity() {
            return pokemonRarity;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item_list, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.getPokemonName().setText(pokemon.getName());
        holder.getPokemonSupertype().setText(pokemon.getSupertype());
        if (pokemon.getRarity() != null) {
            holder.getPokemonRarity().setText("Rarity: " + pokemon.getRarity());
        } else {
            holder.getPokemonRarity().setText("Rarity: Unknown");
        }
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }
}
