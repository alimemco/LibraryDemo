package com.alirnp.librarydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alirnp.mylibrary.Lib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lib.show("hello world!");

    }
}
