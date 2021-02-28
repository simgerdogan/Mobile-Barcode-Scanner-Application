package com.example.barcodeapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductSellers {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("Merchant")
    @Expose
    private String merchant;
    @SerializedName("ProductID")
    @Expose
    private String productID;
    @SerializedName("Quality")
    @Expose
    private String quality;
    @SerializedName("Venue")
    @Expose
    private String venue;
    @SerializedName("Price")
    @Expose
    private Double price;
    @SerializedName("FormattedPrice")
    @Expose
    private String formattedPrice;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("Links")
    @Expose
    private Links links;
    @SerializedName("InStockStatus")
    @Expose
    private String inStockStatus;
    @SerializedName("BasePrice")
    @Expose
    private Integer basePrice;
    @SerializedName("FormattedBasePrice")
    @Expose
    private String formattedBasePrice;
    @SerializedName("DiscountType")
    @Expose
    private Object discountType;
    @SerializedName("DiscountText")
    @Expose
    private Object discountText;
    @SerializedName("Retailer")
    @Expose
    private Retailer retailer;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getFormattedPrice() {
        return formattedPrice;
    }

    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getInStockStatus() {
        return inStockStatus;
    }

    public void setInStockStatus(String inStockStatus) {
        this.inStockStatus = inStockStatus;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public String getFormattedBasePrice() {
        return formattedBasePrice;
    }

    public void setFormattedBasePrice(String formattedBasePrice) {
        this.formattedBasePrice = formattedBasePrice;
    }

    public Object getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Object discountType) {
        this.discountType = discountType;
    }

    public Object getDiscountText() {
        return discountText;
    }

    public void setDiscountText(Object discountText) {
        this.discountText = discountText;
    }

    public Retailer getRetailer() {
        return retailer;
    }

    public void setRetailer(Retailer retailer) {
        this.retailer = retailer;
    }

}