package com.example.die;

import android.app.Application;

public class Public extends Application {

    private int ingnum = 0;
    private int dinum = 0;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public int getingnum() {
        return ingnum;
    }

    public void setingnum(int x) {
        ingnum = x;
    }

    public int getdinum() {
        return dinum;
    }

    public void setdinum(int x) {
        dinum = x;
    }


}
