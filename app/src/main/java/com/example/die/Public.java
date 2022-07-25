package com.example.die;

import android.app.Application;

public class Public extends Application {

    private int ingnum = 0;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public int getnum() {
        return ingnum;
    }

    public void setnum(int x) {
        ingnum = x;
    }

}
