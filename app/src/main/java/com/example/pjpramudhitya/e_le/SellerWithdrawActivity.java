package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SellerWithdrawActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_withdraw);
    }

    public void withdrawKonfirmasi(View v){
        startActivity(new Intent(SellerWithdrawActivity.this, SellerPinLepayActivity.class));
    }

    //Navbar is here
    public void homeSeller(View v){
        startActivity(new Intent(SellerWithdrawActivity.this, SellerHomeActivity.class));
    }

    public void riwayat(View v){
        startActivity(new Intent(SellerWithdrawActivity.this, SellerRiwayatActivity.class));
    }

    public void bantuan(View v){
        startActivity(new Intent(SellerWithdrawActivity.this, SellerBantuanActivity.class));
    }

    public void profile(View v){
        startActivity(new Intent(SellerWithdrawActivity.this, SellerProfileActivity.class));
    }
}
