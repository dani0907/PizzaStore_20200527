package com.example.pizzastore_20200527;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.pizzastore_20200527.databinding.ActivityPizzaStoreDetailBinding;
import com.example.pizzastore_20200527.datas.PizzaStore;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.List;

public class PizzaStoreDetailActivity extends BaseActivity {

    ActivityPizzaStoreDetailBinding binding;

    PizzaStore mStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_pizza_store_detail);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        binding.callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PermissionListener permissionListener = new PermissionListener() {
                    @Override
                    public void onPermissionGranted() {
                        String phoneNum = binding.phoneNumTxt.getText().toString();
                        Uri myUri = Uri.parse(String.format("tel:%s",mStore.getPhoneNum()));
                        Intent myintent = new Intent(Intent.ACTION_CALL,myUri);
                        startActivity(myintent);


                    }

                    @Override
                    public void onPermissionDenied(List<String> deniedPermissions) {

                        Toast.makeText(mContxt, "권한이 거부되어 통화가 불가능합니다.", Toast.LENGTH_SHORT).show();

                    }
                };

                TedPermission.with(mContxt)
                        .setPermissionListener(permissionListener)
                        .setDeniedMessage("거부하면 통화가 불가능함. \n설정에서 권한을 켜주세요.")
                        .setPermissions(Manifest.permission.CALL_PHONE)
                        .check();


            }
        });

    }

    @Override
    public void setValues() {

        mStore = (PizzaStore)getIntent().getSerializableExtra("store");
        binding.nameTxt.setText(mStore.getName());
        binding.phoneNumTxt.setText(mStore.getPhoneNum());

        Glide.with(mContxt).load(mStore.getLogoImgUrl()).into(binding.logoImg);

    }
}
