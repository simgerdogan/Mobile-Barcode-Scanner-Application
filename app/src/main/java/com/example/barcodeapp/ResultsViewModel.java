package com.example.barcodeapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ResultsViewModel extends AndroidViewModel {

    private BarcodeRepository mRepository;
    private LiveData<List<BarcodeItem>> mAllBarcode;

    public ResultsViewModel(@NonNull Application application) {
        super(application);
        mRepository = new BarcodeRepository(application);
        mAllBarcode = mRepository.getmAllBarcodes();
    }

     LiveData<List<BarcodeItem>> getmAllBarcode()
    {
        return mAllBarcode;
    };

    public void insertBarcode(BarcodeItem barcodeItem)
    {
        mRepository.insert(barcodeItem);
    }

    public void updateBarcode(String newBarcode)
    {
        mRepository.updateBarcode(newBarcode);
    }

}
