package com.thundersoda.samplemvp.model;

import com.google.gson.annotations.SerializedName;

public class Images {
    @SerializedName("logo")
    private String logo;

    @SerializedName("symbol")
    private String symbol;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
