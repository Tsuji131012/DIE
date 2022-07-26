package com.example.die;

import android.app.Application;

public class Public extends Application {

    private int ingnum = 0;
    private int dinum = 0;
    private int[] ingredient = new int[6];
    private boolean swap = false;

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

    public int geting(int x) {
        return ingredient[x];
    }

    public void seting(int ing, int x) {
            ingredient[x] = ing;
    }

    public boolean getflag() {
        return swap;
    }

    public void setflag(boolean x) {
        swap = x;
    }


}
