package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PengaturanTangkiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan_tanki);
    }

    public void saveBtn(View v){
        startActivity(new Intent(PengaturanTangkiActivity.this, KolamHomeActivity.class));
    }

    public void cancelBtn(View v){
        startActivity(new Intent(PengaturanTangkiActivity.this, KolamHomeActivity.class));
    }


    //Navbar is here
    public void homeBtn(View v){
        startActivity(new Intent(PengaturanTangkiActivity.this, KolamHomeActivity.class));
    }

    public void riwayatBtn(View v){
        startActivity(new Intent(PengaturanTangkiActivity.this, KolamRiwayatActivity.class));
    }

    public void bantuanBtn(View v){
        startActivity(new Intent(PengaturanTangkiActivity.this, KolamBantuanActivity.class));
    }

    public void profileBtn(View v){
        startActivity(new Intent(PengaturanTangkiActivity.this, KolamProfileActivity.class));
    }
}
