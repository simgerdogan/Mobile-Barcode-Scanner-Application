package com.example.barcodeapp;

public class ProductItem {
    private String productId,price,inStock,venue,merchant,quality,link;

    public ProductItem(String productId, String price, String inStock, String venue, String merchant, String quality,String link) {
        this.productId = productId;
        this.price = price;
        this.inStock = inStock;
        this.venue = venue;
        this.merchant = merchant;
        this.quality = quality;
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
