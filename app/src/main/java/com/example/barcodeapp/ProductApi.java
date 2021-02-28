package com.example.barcodeapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ProductApi {

    String apiKey ="18b439b0ebmshed340a43642ea75p19f1a8jsnd340f8473b24";
    String host =  "ebay-com.p.rapidapi.com";


    @Headers({
            "x-rapidapi-key: 18b439b0ebmshed340a43642ea75p19f1a8jsnd340f8473b24"
    })
    @GET("/products/{barcode}/offers")
    Call<List<ProductSellers>> getProductSellers(@Path("barcode") String barcode);

}
