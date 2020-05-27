package com.example.pizzastore_20200527;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.pizzastore_20200527.adapters.PizzaStoreAdapter;
import com.example.pizzastore_20200527.databinding.ActivityMainBinding;
import com.example.pizzastore_20200527.datas.PizzaStore;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    List<PizzaStore> pizzaStoreList = new ArrayList<>();
    PizzaStoreAdapter psa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        addPizzaStores();

        psa = new PizzaStoreAdapter(mContxt, R.layout.pizza_store_list_item,pizzaStoreList);
        binding.pizzaStoreListView.setAdapter(psa);
    }

    void addPizzaStores(){
        pizzaStoreList.add(new PizzaStore("피자헛","1588-0088","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"));
        pizzaStoreList.add(new PizzaStore("파파존스","1577-5577","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"));
        pizzaStoreList.add(new PizzaStore("미스터피자","1566-5566","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200"));
        pizzaStoreList.add(new PizzaStore("도미노피자","1544-7788","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png"));
    }
}
