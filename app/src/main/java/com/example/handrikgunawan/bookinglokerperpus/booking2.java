package com.example.handrikgunawan.bookinglokerperpus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class booking2 extends AppCompatActivity implements View.OnClickListener {


    ImageButton b111, b222, b333;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking2);

        b111 = findViewById(R.id.loker4);
        b222 = findViewById(R.id.loker5);
        b333 = findViewById(R.id.loker6);

        b111.setOnClickListener(this);
        b222.setOnClickListener(this);
        b333.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loker4:
                startActivity(new Intent(booking2.this, loker4.class));
                finish();
                break;
            case R.id.loker5:
                break;
            case R.id.loker6:
                break;
        }
    }
}


