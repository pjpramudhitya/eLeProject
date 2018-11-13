package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class KolamProfileActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolam_profile);
    }

    public void saveBtn(View v){

    }

    public void logout(View v){
        startActivity(new Intent(KolamProfileActivity.this, LoginActivity.class));
    }

    //Navbar is here
    public void homeBtn(View v){
        startActivity(new Intent(KolamProfileActivity.this, KolamHomeActivity.class));
    }

    public void riwayatBtn(View v){
        startActivity(new Intent(KolamProfileActivity.this, KolamRiwayatActivity.class));
    }

    public void bantuanBtn(View v){
        startActivity(new Intent(KolamProfileActivity.this, KolamBantuanActivity.class));
    }

    public void profileBtn(View v){
        startActivity(new Intent(KolamProfileActivity.this, KolamProfileActivity.class));
    }
}
