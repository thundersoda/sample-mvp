package com.thundersoda.samplemvp.model;

import com.google.gson.annotations.SerializedName;

public class Set {
    @SerializedName("images")
    private Images images;

    @SerializedName("updatedAt")
    private String updatedAt;

    @SerializedName("releaseDate")
    private String releaseDate;

    @SerializedName("ptcgoCode")
    private String ptcgoCode;

    @SerializedName("legalities")
    private Legalities legalities;

    @SerializedName("total")
    private int total;

    @SerializedName("printedTotal")
    private int printedTotal;

    @SerializedName("series")
    private String series;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private String id;

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPtcgoCode() {
        return ptcgoCode;
    }

    public void setPtcgoCode(String ptcgoCode) {
        this.ptcgoCode = ptcgoCode;
    }

    public Legalities getLegalities() {
        return legalities;
    }

    public void setLegalities(Legalities legalities) {
        this.legalities = legalities;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPrintedTotal() {
        return printedTotal;
    }

    public void setPrintedTotal(int printedTotal) {
        this.printedTotal = printedTotal;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
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
