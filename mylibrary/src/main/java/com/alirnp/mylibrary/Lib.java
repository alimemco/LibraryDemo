package com.alirnp.mylibrary;

import android.util.Log;

public class Lib {

    private static final String TAG = "Lib";

    public static void show(String message){
        Log.i(TAG, "show: "+message);
    }
}
