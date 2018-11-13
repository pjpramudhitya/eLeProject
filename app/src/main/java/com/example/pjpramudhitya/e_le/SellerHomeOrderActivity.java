package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SellerHomeOrderActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_home_order_masuk);
    }

    public void ambilOrder(View v){
        startActivity(new Intent(SellerHomeOrderActivity.this, SellerPinLepayActivity.class));
    }

    //Navbar is here
    public void homeSeller(View v){
        startActivity(new Intent(SellerHomeOrderActivity.this, SellerHomeActivity.class));
    }

    public void riwayat(View v){
        startActivity(new Intent(SellerHomeOrderActivity.this, SellerRiwayatActivity.class));
    }

    public void bantuan(View v){
        startActivity(new Intent(SellerHomeOrderActivity.this, SellerBantuanActivity.class));
    }

    public void profile(View v){
        startActivity(new Intent(SellerHomeOrderActivity.this, SellerProfileActivity.class));
    }
}
