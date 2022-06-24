package com.thundersoda.samplemvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thundersoda.samplemvp.contract.MainActivityContract;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setUpElements() {

    }
}