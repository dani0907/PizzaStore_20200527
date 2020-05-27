package com.example.pizzastore_20200527;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    public Context mContxt = this;

    public abstract void setupEvents();
    public abstract void setValues();
}
