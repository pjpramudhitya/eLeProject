package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SellerHomeActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_home);
    }

    public void withdraw(View v){
        startActivity(new Intent(SellerHomeActivity.this, SellerWithdrawActivity.class));
    }

    public void riwayatWithdraw(View v){
        startActivity(new Intent(SellerHomeActivity.this, SellerRiwayatWithdrawActivity.class));
    }
    public void orderMasuk(View v){
        startActivity(new Intent(SellerHomeActivity.this, SellerHomeOrderActivity.class));
    }


    //Navbar is here
    public void homeSeller(View v){
        startActivity(new Intent(SellerHomeActivity.this, SellerHomeActivity.class));
    }

    public void riwayat(View v){
        startActivity(new Intent(SellerHomeActivity.this, SellerRiwayatActivity.class));
    }

    public void bantuan(View v){
        startActivity(new Intent(SellerHomeActivity.this, SellerBantuanActivity.class));
    }

    public void profile(View v){
        startActivity(new Intent(SellerHomeActivity.this, SellerProfileActivity.class));
    }
}
