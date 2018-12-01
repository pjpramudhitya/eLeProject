package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class KolamProfileActivity extends AppCompatActivity{
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference mRef = database.getReference("https://eleproject-2d230.firebaseio.com/Users/gibs");
    private TextView txt_nama, txt_username, txt_alamat, txt_email, txt_notelp, txt_pin, txt_saldo, txt_password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolam_profile);

        txt_nama = (TextView) findViewById(R.id.txt_nama);
        txt_username = (TextView) findViewById(R.id.txt_username);
        txt_alamat = (TextView) findViewById(R.id.txt_alamat);
        txt_email = (TextView) findViewById(R.id.txt_email);
        txt_notelp = (TextView) findViewById(R.id.txt_noHP);
        txt_pin = (TextView) findViewById(R.id.txt_pin);
        txt_password = (TextView) findViewById(R.id.txt_password);

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Map<String, String> map = dataSnapshot.getValue(Map.class);

                String name = map.get("Name");
                String email = map.get("email");
                String no_telp = map.get("no_telp");
                String alamat = map.get("alamat");
                String pin_lepay = map.get("pin_lepay");
                String saldo_lepay = map.get("saldo_lepay");

                txt_nama.setText(name);
                txt_email.setText(email);
                txt_notelp.setText(no_telp);
                txt_alamat.setText(alamat);
                txt_pin.setText(pin_lepay);
                txt_saldo.setText(saldo_lepay);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
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
