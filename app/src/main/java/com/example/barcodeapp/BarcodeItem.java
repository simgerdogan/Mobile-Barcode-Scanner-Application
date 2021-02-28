package com.example.barcodeapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "barcode_table")
public class BarcodeItem {

    @PrimaryKey(autoGenerate = true)
    private int barcodeId ;

    @ColumnInfo(name = "barcode")
    private String barcode;

    public BarcodeItem(String barcode)
    {
        this.barcode = barcode;
    }


    public int getBarcodeId() {
        return barcodeId;
    }

    public void setBarcodeId(int barcodeId) {
        this.barcodeId = barcodeId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
