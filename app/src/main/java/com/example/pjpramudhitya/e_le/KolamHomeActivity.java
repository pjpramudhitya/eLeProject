package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class KolamHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolam_home);
    }

<<<<<<< HEAD
    public void isiSaldoBtn(View v){
        startActivity(new Intent(KolamHomeActivity.this, IsiSaldoActivity.class));
    }

    public void beliPakanBtn(View v){
        startActivity(new Intent(KolamHomeActivity.this, BeliPakanActivity.class));
    }

    public void aturTangkiBtn(View v){
        startActivity(new Intent(KolamHomeActivity.this, AturTangkiActivity.class));
    }

    //Navbar is here
    public void homeBtn(View v){
        startActivity(new Intent(KolamHomeActivity.this, KolamHomeActivity.class));
    }

    public void riwayatBtn(View v){
        startActivity(new Intent(KolamHomeActivity.this, KolamRiwayatActivity.class));
    }

    public void bantuanBtn(View v){
        startActivity(new Intent(KolamHomeActivity.this, KolamBantuanActivity.class));
    }

    public void profileBtn(View v){
        startActivity(new Intent(KolamHomeActivity.this, KolamProfileActivity.class));
    }
=======

    //error, balik ke halaman login terus
    /*public void isiSaldo(View isiSaldo){

        startActivity(new Intent(KolamHomeActivity.this, IsiSaldoActivity.class));

    }

    public void bantuan(View bantuan){
        startActivity(new Intent(KolamHomeActivity.this, KolamBantuanActivity.class));
    }

    public void riwayat(View riwayat){
        startActivity(new Intent(KolamHomeActivity.this, KolamRiwayatActivity.class));
    }

    public void akun(View akun){
        startActivity(new Intent(KolamHomeActivity.this, KolamProfilActivity.class));
    }

    public void beliPakan(View beliPakan){
        startActivity(new Intent(KolamHomeActivity.this, BeliPakanActivity.class));
    }*/



>>>>>>> 053265a521d81e64fdea01b1243d7fd7cfcc816a
}
