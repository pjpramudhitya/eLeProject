package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class LoginActivity extends AppCompatActivity {
    private EditText mUsernameView;
    private EditText mPasswordView;
    private Button btnSignIn;

    //firebase
    FirebaseDatabase database;
    DatabaseReference users;
    DatabaseReference seller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsernameView = (EditText) findViewById(R.id.txt_username);
        mPasswordView = (EditText) findViewById(R.id.txt_password);
        btnSignIn = (Button) findViewById(R.id.btn_login);

        //firebase
        //database = FirebaseDatabase.getInstance().getReference("https://eleproject-2d230.firebaseio.com/");


    }

    public void login(View v){
        final String username = (String) mUsernameView.getText().toString();
        final String passwordTxt = (String) mPasswordView.getText().toString();





        if (username.equalsIgnoreCase("seller")){
            startActivity(new Intent(LoginActivity.this, SellerHomeActivity.class));
        } else{
            startActivity(new Intent(LoginActivity.this, KolamHomeActivity.class));
        }

    }

}
