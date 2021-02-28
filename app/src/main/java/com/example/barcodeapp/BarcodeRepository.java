package com.example.barcodeapp;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class BarcodeRepository {

    private BarcodeDao mBarcodeDao;
    private LiveData<List<BarcodeItem>> mAllBarcodes;

    BarcodeRepository(Application application)
    {
        AppDatabase db = AppDatabase.getInstance(application);
        mBarcodeDao =db.barcodeDao();
        mAllBarcodes =mBarcodeDao.getAll();
    }

    LiveData<List<BarcodeItem>> getmAllBarcodes()
    {
        return mAllBarcodes;
    }

    public void insert (BarcodeItem barcodeItem)
    {
        new InsertBarcodeAsyncTask(mBarcodeDao).execute(barcodeItem);
    }

    public void updateBarcode(String newBarcode)
    {
        new UpdateBarcodeAsyncTask(mBarcodeDao).execute(newBarcode);
    }


    private static class InsertBarcodeAsyncTask extends AsyncTask<BarcodeItem,Void,Void>
    {
        private BarcodeDao barcodeDao;

        private InsertBarcodeAsyncTask(BarcodeDao barcodeDao)
        {
            this.barcodeDao = barcodeDao;
        }

        @Override
        protected Void doInBackground(BarcodeItem... barcodeItems) {
            barcodeDao.insert(barcodeItems[0]);
            return null;
        }
    }

    private static class UpdateBarcodeAsyncTask extends AsyncTask<String,Void,Void>
    {
        private BarcodeDao barcodeDao;
        private UpdateBarcodeAsyncTask(BarcodeDao barcodeDao)
        {
            this.barcodeDao = barcodeDao;
        }

        @Override
        protected Void doInBackground(String... barcodeItems) {
            barcodeDao.updateBarcode(barcodeItems[0]);
            return null;
        }
    }


}
