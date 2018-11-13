package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SellerBantuanActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_bantuan);
    }

    //Navbar is here
    public void homeSeller(View v){
        startActivity(new Intent(SellerBantuanActivity.this, SellerHomeActivity.class));
    }

    public void riwayat(View v){
        startActivity(new Intent(SellerBantuanActivity.this, SellerRiwayatActivity.class));
    }

    public void bantuan(View v){
        startActivity(new Intent(SellerBantuanActivity.this, SellerBantuanActivity.class));
    }

    public void profile(View v){
        startActivity(new Intent(SellerBantuanActivity.this, SellerProfileActivity.class));
    }
}
