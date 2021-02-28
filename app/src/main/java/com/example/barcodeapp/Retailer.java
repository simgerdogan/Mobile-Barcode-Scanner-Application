package com.example.barcodeapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Retailer {

    @SerializedName("DisplayName")
    @Expose
    private String displayName;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}