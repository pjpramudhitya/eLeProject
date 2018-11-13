package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SellerProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_profile);
    }

    //Navbar is here
    public void homeSeller(View v){
        startActivity(new Intent(SellerProfileActivity.this, SellerHomeActivity.class));
    }

    public void logout(View v){
        startActivity(new Intent(SellerProfileActivity.this, LoginActivity.class));
    }

    public void riwayat(View v){
        startActivity(new Intent(SellerProfileActivity.this, SellerRiwayatActivity.class));
    }

    public void bantuan(View v){
        startActivity(new Intent(SellerProfileActivity.this, SellerBantuanActivity.class));
    }

    public void profile(View v){
        startActivity(new Intent(SellerProfileActivity.this, SellerProfileActivity.class));
    }
}
