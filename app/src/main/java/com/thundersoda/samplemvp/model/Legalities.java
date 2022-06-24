package com.thundersoda.samplemvp.model;

import com.google.gson.annotations.SerializedName;

public class Legalities {
    @SerializedName("unlimited")
    private String unlimited;

    public String getUnlimited() {
        return unlimited;
    }

    public void setUnlimited(String unlimited) {
        this.unlimited = unlimited;
    }
}
