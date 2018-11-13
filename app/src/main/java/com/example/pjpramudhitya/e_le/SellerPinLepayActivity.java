package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SellerPinLepayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_pin_lepay);
    }

    public void konfirmasiAmbil(View v){
        startActivity(new Intent(SellerPinLepayActivity.this, SellerHomeProsesActivity.class));
    }

    public void batalPin(View v){
        startActivity(new Intent(SellerPinLepayActivity.this, SellerHomeActivity.class));
    }

    //Navbar is here
    public void homeSeller(View v){
        startActivity(new Intent(SellerPinLepayActivity.this, SellerHomeActivity.class));
    }

    public void riwayat(View v){
        startActivity(new Intent(SellerPinLepayActivity.this, SellerRiwayatActivity.class));
    }

    public void bantuan(View v){
        startActivity(new Intent(SellerPinLepayActivity.this, SellerBantuanActivity.class));
    }

    public void profile(View v){
        startActivity(new Intent(SellerPinLepayActivity.this, SellerProfileActivity.class));
    }
}
