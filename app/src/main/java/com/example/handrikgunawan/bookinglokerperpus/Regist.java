package com.example.handrikgunawan.bookinglokerperpus;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Regist extends AppCompatActivity {
    private EditText email,password;
    private FirebaseAuth mFirebaseAuth;
    private TextView Tv_Login;
    private Button btn_Regist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        btn_Regist = (Button) findViewById(R.id.btn_Regist);
        mFirebaseAuth = FirebaseAuth.getInstance();
        Tv_Login = (TextView) findViewById(R.id.TvLogin);
        
        btn_Regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email1 = email.getText().toString().trim();
                String passwd = password.getText().toString().trim();
                mFirebaseAuth.createUserWithEmailAndPassword(email1,passwd).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(Regist.this, "Berhasil Daftar", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Regist.this,MainActivity.class));
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Regist.this, "Gagal Daftar", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
