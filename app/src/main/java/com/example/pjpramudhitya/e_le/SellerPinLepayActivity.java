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
        setContentView(R.layout.activity_kolam_pin_lepay);
    }

    public void konfirmasiAmbil(View v){
        startActivity(new Intent(SellerPinLepayActivity.this, SellerHomeProsesActivity.class));
    }

    public void batalPin(View v){
        startActivity(new Intent(SellerPinLepayActivity.this, SellerHomeOrderActivity.class));
    }
}
