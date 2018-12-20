package com.example.handrikgunawan.bookinglokerperpus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class booking3 extends AppCompatActivity implements View.OnClickListener {


    ImageButton b1111, b2222, b3333;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking3);

        b1111 = findViewById(R.id.loker7);
        b2222 = findViewById(R.id.loker8);
        b3333 = findViewById(R.id.loker9);

        b1111.setOnClickListener(this);
        b2222.setOnClickListener(this);
        b3333.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loker7:
                startActivity(new Intent(booking3.this, loker7.class));
                finish();
                break;
            case R.id.loker8:
                break;
            case R.id.loker9:
                break;
        }
    }
}

