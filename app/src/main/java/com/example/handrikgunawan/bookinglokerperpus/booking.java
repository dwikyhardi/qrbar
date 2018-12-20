package com.example.handrikgunawan.bookinglokerperpus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class booking extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        b1 = findViewById(R.id.booking1);
        b2 = findViewById(R.id.booking2);
        b3 = findViewById(R.id.booking3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.booking1:

                startActivity(new Intent(booking.this, booking1.class));
                finish();
                break;
            case R.id.booking2:
                startActivity(new Intent(booking.this, booking2.class));
                finish();
                break;
            case R.id.booking3:
                startActivity(new Intent(booking.this, booking3.class));
                finish();
                break;
        }
    }
}