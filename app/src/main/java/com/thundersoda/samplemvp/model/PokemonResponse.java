package com.thundersoda.samplemvp.model;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PokemonResponse {
    @SerializedName("data")
    private List<Pokemon> data;

    public List<Pokemon> getData() {
        return data;
    }

    @NonNull
    @Override
    public String toString() {
        return data.toString();
    }
}
