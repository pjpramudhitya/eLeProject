package com.example.pjpramudhitya.e_le;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText mUsernameView;
    private EditText mPasswordView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsernameView = (EditText) findViewById(R.id.txt_username);
        mPasswordView = (EditText) findViewById(R.id.txt_password);

    }

    public void login(View v){
        String username = (String) mUsernameView.getText().toString();
        String password = (String) mPasswordView.getText().toString();


            startActivity(new Intent(LoginActivity.this, KolamHomeActivity.class));

    }

}
