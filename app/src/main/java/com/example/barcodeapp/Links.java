package com.example.barcodeapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("AffiliateLink")
    @Expose
    private String affiliateLink;
    @SerializedName("CashbackLink")
    @Expose
    private Object cashbackLink;
    @SerializedName("ParentLink")
    @Expose
    private Object parentLink;
    @SerializedName("ParentAffiliateLink")
    @Expose
    private Object parentAffiliateLink;
    @SerializedName("ParentCashbackLink")
    @Expose
    private Object parentCashbackLink;

    public String getAffiliateLink() {
        return affiliateLink;
    }

    public void setAffiliateLink(String affiliateLink) {
        this.affiliateLink = affiliateLink;
    }

    public Object getCashbackLink() {
        return cashbackLink;
    }

    public void setCashbackLink(Object cashbackLink) {
        this.cashbackLink = cashbackLink;
    }

    public Object getParentLink() {
        return parentLink;
    }

    public void setParentLink(Object parentLink) {
        this.parentLink = parentLink;
    }

    public Object getParentAffiliateLink() {
        return parentAffiliateLink;
    }

    public void setParentAffiliateLink(Object parentAffiliateLink) {
        this.parentAffiliateLink = parentAffiliateLink;
    }

    public Object getParentCashbackLink() {
        return parentCashbackLink;
    }

    public void setParentCashbackLink(Object parentCashbackLink) {
        this.parentCashbackLink = parentCashbackLink;
    }

}