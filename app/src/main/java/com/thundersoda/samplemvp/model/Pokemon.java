package com.thundersoda.samplemvp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pokemon {
    @SerializedName("legalities")
    private Legalities legalities;

    @SerializedName("nationalPokedexNumbers")
    private List<Integer> nationalPokedexNumbers;

    @SerializedName("rarity")
    private String rarity;

    @SerializedName("artist")
    private String artist;

    @SerializedName("number")
    private String number;

    @SerializedName("set")
    private Set set;

    @SerializedName("convertedRetreatCost")
    private int convertedRetreatCost;

    @SerializedName("retreatCost")
    private List<String> retreatCost;

    @SerializedName("resistances")
    private List<Resistances> resistances;

    @SerializedName("weaknesses")
    private List<Weaknesses> weaknesses;

    @SerializedName("attacks")
    private List<Attacks> attacks;

    @SerializedName("types")
    private java.util.List<String> types;

    @SerializedName("hp")
    private String hp;

    @SerializedName("level")
    private String level;

    @SerializedName("subtypes")
    private java.util.List<String> subtypes;

    @SerializedName("supertype")
    private String supertype;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private String id;

    public Legalities getLegalities() {
        return legalities;
    }

    public void setLegalities(Legalities legalities) {
        this.legalities = legalities;
    }

    public List<Integer> getNationalPokedexNumbers() {
        return nationalPokedexNumbers;
    }

    public void setNationalPokedexNumbers(List<Integer> nationalPokedexNumbers) {
        this.nationalPokedexNumbers = nationalPokedexNumbers;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public int getConvertedRetreatCost() {
        return convertedRetreatCost;
    }

    public void setConvertedRetreatCost(int convertedRetreatCost) {
        this.convertedRetreatCost = convertedRetreatCost;
    }

    public List<String> getRetreatCost() {
        return retreatCost;
    }

    public void setRetreatCost(List<String> retreatCost) {
        this.retreatCost = retreatCost;
    }

    public List<Resistances> getResistances() {
        return resistances;
    }

    public void setResistances(List<Resistances> resistances) {
        this.resistances = resistances;
    }

    public List<Weaknesses> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<Weaknesses> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public List<Attacks> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attacks> attacks) {
        this.attacks = attacks;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<String> getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(List<String> subtypes) {
        this.subtypes = subtypes;
    }

    public String getSupertype() {
        return supertype;
    }

    public void setSupertype(String supertype) {
        this.supertype = supertype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
