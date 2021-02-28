package com.example.barcodeapp;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface BarcodeDao {


    @Query("SELECT * FROM barcode_table")
    LiveData<List<BarcodeItem>> getAll();

    @Query("UPDATE barcode_table SET barcode = :newBarcode WHERE barcodeId = 1")
    void updateBarcode(String newBarcode);

    @Insert
    void insert(BarcodeItem barcodeItem);

    @Delete
    void delete(BarcodeItem barcodeItem);



}
