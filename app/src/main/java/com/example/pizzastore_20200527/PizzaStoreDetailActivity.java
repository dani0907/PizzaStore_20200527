package com.example.pizzastore_20200527;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.pizzastore_20200527.databinding.ActivityPizzaStoreDetailBinding;

public class PizzaStoreDetailActivity extends BaseActivity {

    ActivityPizzaStoreDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_pizza_store_detail);
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
