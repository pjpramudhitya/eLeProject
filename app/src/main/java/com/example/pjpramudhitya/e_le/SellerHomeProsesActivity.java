package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SellerHomeProsesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_home_proses_kirim);
    }

    public void selesai(View v){
        startActivity(new Intent(SellerHomeProsesActivity.this, SellerHomeActivity.class));
    }

    //Navbar is here
    public void homeSeller(View v){
        startActivity(new Intent(SellerHomeProsesActivity.this, SellerHomeActivity.class));
    }

    public void riwayat(View v){
        startActivity(new Intent(SellerHomeProsesActivity.this, SellerRiwayatActivity.class));
    }

    public void bantuan(View v){
        startActivity(new Intent(SellerHomeProsesActivity.this, SellerBantuanActivity.class));
    }

    public void profile(View v){
        startActivity(new Intent(SellerHomeProsesActivity.this, SellerProfileActivity.class));
    }
}
