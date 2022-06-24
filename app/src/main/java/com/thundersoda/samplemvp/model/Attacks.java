package com.thundersoda.samplemvp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Attacks {
    @SerializedName("text")
    private String text;

    @SerializedName("damage")
    private String damage;

    @SerializedName("convertedEnergyCost")
    private int convertedEnergyCost;

    @SerializedName("cost")
    private List<String> cost;

    @SerializedName("name")
    private String name;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public int getConvertedEnergyCost() {
        return convertedEnergyCost;
    }

    public void setConvertedEnergyCost(int convertedEnergyCost) {
        this.convertedEnergyCost = convertedEnergyCost;
    }

    public List<String> getCost() {
        return cost;
    }

    public void setCost(List<String> cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
