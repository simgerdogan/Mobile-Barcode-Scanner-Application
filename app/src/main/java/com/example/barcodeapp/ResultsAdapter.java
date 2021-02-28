package com.example.barcodeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResultsAdapter  extends RecyclerView.Adapter<ResultsAdapter.ResultsViewHolder>{

    private ArrayList<ProductItem> productItems;
    private OnItemClickListener mListener;
    public interface OnItemClickListener
    {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener)
    {
        mListener = listener;
    }
    public static class ResultsViewHolder extends RecyclerView.ViewHolder
    {
        public TextView productIdText,priceText,inStockText,venueText,merchantText,qualityText;
        public ResultsViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            productIdText = itemView.findViewById(R.id.productIdText);
            priceText = itemView.findViewById(R.id.priceText);
            inStockText = itemView.findViewById(R.id.inStockText);
            venueText = itemView.findViewById(R.id.venueText);
            merchantText = itemView.findViewById(R.id.merchantText);
            qualityText = itemView.findViewById(R.id.qualityText);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null)
                    {
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION)
                        {
                            listener.onItemClick(position);
                        }
                    }
                }
            });

        }
    }

    public ResultsAdapter(ArrayList<ProductItem> productItems)
    {
        this.productItems = productItems;
    }

    @NonNull
    @Override
    public ResultsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item,parent,false);
        ResultsViewHolder rvh = new ResultsViewHolder(v,mListener);
        return rvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ResultsViewHolder holder, int position) {

        ProductItem currentItem = productItems.get(position);

        holder.qualityText.setText(currentItem.getQuality());
        holder.merchantText.setText(currentItem.getMerchant());
        holder.venueText.setText(currentItem.getVenue());
        holder.inStockText.setText(currentItem.getInStock());
        holder.priceText.setText(currentItem.getPrice());
        holder.productIdText.setText(currentItem.getProductId());

    }

    @Override
    public int getItemCount() {
        return productItems.size();
    }
}
