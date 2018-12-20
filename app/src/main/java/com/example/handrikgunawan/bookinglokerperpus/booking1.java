package com.example.handrikgunawan.bookinglokerperpus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class booking1 extends AppCompatActivity implements View.OnClickListener {


    ImageButton b11, b22, b33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking1);

        b11 = findViewById(R.id.loker1);
        b22 = findViewById(R.id.loker2);
        b33 = findViewById(R.id.loker3);

        b11.setOnClickListener(this);
        b22.setOnClickListener(this);
        b33.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loker1:
                startActivity(new Intent(booking1.this, loker1.class));
                finish();
                break;
            case R.id.loker2:
                break;
            case R.id.loker3:
                break;
        }
    }
}
