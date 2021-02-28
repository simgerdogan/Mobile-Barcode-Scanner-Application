package com.example.barcodeapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class    ResultsFragment extends Fragment {

    private ResultsViewModel resultsViewModel;
    private List<ProductSellers> productSellersList;
    private ArrayList<ProductItem> productItemList;
    private RecyclerView mRecyclerView;
    private ResultsAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private TextView resultsText ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_results, container, false);
        resultsViewModel = ViewModelProviders.of(this).get(ResultsViewModel.class);

        resultsViewModel.getmAllBarcode().observe(getViewLifecycleOwner(), new Observer<List<BarcodeItem>>() {
            @Override
            public void onChanged(List<BarcodeItem> barcodeItems) {
                String barcode = barcodeItems.get(0).getBarcode();
                getProductSellersData(barcode);
            }
        });

        mRecyclerView = v.findViewById(R.id.resultsRecyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager  = new LinearLayoutManager(getContext());
        resultsText = v.findViewById(R.id.resultsText);

        return v;
    }

    private void getProductSellersData(String barcode)
    {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://ebay-com.p.rapidapi.com/").addConverterFactory(GsonConverterFactory.create()).build();
        ProductApi productApi = retrofit.create(ProductApi.class);
        Log.d("responsek", "barcode: "+barcode);
        productSellersList = new ArrayList<>();

        Call<List<ProductSellers>> call = productApi.getProductSellers(barcode);

        call.enqueue(new Callback<List<ProductSellers>>() {
            @Override
            public void onResponse(Call<List<ProductSellers>> call, Response<List<ProductSellers>> response) {
                productSellersList = response.body();

                if(productSellersList != null)
                {
                    productItemList = new ArrayList<>();

                    for(int i = 0 ; i < productSellersList.size();i++)
                    {
                        String quality = productSellersList.get(i).getQuality();
                        String price = productSellersList.get(i).getFormattedPrice();
                        String link = productSellersList.get(i).getLink();
                        String productId = productSellersList.get(i).getProductID();
                        String venue = productSellersList.get(i).getVenue();
                        String merchant = productSellersList.get(i).getMerchant();
                        String inStock = productSellersList.get(i).getInStockStatus();

                        productItemList.add(new ProductItem(productId,price,inStock,venue,merchant,quality,link));

                    }

                    resultsText.setText("Total Results :" + Integer.toString(productSellersList.size()));
                    mAdapter = new ResultsAdapter(productItemList);
                    mRecyclerView.setLayoutManager(mLayoutManager);
                    mRecyclerView.setAdapter(mAdapter);
                    mAdapter.setOnItemClickListener(new ResultsAdapter.OnItemClickListener() {
                        @Override
                        public void onItemClick(int position) {
                            String link = productItemList.get(position).getLink();
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                            startActivity(browserIntent);
                        }
                    });
                }
                else
                {
                        resultsText.setText("No Result Found.");
                }



            }

            @Override
            public void onFailure(Call<List<ProductSellers>> call, Throwable t) {

            }

        });
    }
}
