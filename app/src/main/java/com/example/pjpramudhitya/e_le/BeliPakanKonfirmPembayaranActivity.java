package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BeliPakanKonfirmPembayaranActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beli_pakan_konfirmasi_pembayaran);
    }

    public void bayarBtn(View v){
        startActivity(new Intent(BeliPakanKonfirmPembayaranActivity.this, KolamPinLepayActivity.class));
    }

    public void batalBtn(View v){
        startActivity(new Intent(BeliPakanKonfirmPembayaranActivity.this, BeliPakanActivity.class));
    }

    //Navbar is here
    public void homeBtn(View v){
        startActivity(new Intent(BeliPakanKonfirmPembayaranActivity.this, KolamHomeActivity.class));
    }

    public void riwayatBtn(View v){
        startActivity(new Intent(BeliPakanKonfirmPembayaranActivity.this, KolamRiwayatActivity.class));
    }

    public void bantuanBtn(View v){
        startActivity(new Intent(BeliPakanKonfirmPembayaranActivity.this, KolamBantuanActivity.class));
    }

    public void profileBtn(View v){
        startActivity(new Intent(BeliPakanKonfirmPembayaranActivity.this, KolamProfileActivity.class));
    }
}
