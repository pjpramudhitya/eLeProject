package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SellerRiwayatActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_riwayat);
    }

    //Navbar is here
    public void homeSeller(View v){
        startActivity(new Intent(SellerRiwayatActivity.this, SellerHomeActivity.class));
    }

    public void riwayat(View v){
        startActivity(new Intent(SellerRiwayatActivity.this, SellerRiwayatActivity.class));
    }

    public void bantuan(View v){
        startActivity(new Intent(SellerRiwayatActivity.this, SellerBantuanActivity.class));
    }

    public void profile(View v){
        startActivity(new Intent(SellerRiwayatActivity.this, SellerProfileActivity.class));
    }
}
