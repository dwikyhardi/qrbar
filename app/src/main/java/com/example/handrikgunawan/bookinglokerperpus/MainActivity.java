package com.example.handrikgunawan.bookinglokerperpus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mFirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton loker = (ImageButton) findViewById(R.id.job);
        ImageButton about = (ImageButton) findViewById(R.id.rate);
        ImageButton profil = (ImageButton) findViewById(R.id.user);
        ImageButton lastest = (ImageButton) findViewById(R.id.notif);
        ImageButton exit = (ImageButton) findViewById(R.id.rev);
        mFirebaseAuth = FirebaseAuth.getInstance();

        loker.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, booking.class));
                finish();

                //menggunakan intent untuk berpindah ke activity sebelumnya
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, about.class));
                finish();

                //menggunakan intent untuk berpindah ke activity sebelumnya
            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Profile.class));
                finish();

                //menggunakan intent untuk berpindah ke activity sebelumnya
            }
        });

        lastest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, latestbook1.class));
                finish();

                //menggunakan intent untuk berpindah ke activity sebelumnya
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Yakin Ingin Keluar ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mFirebaseAuth.signOut();
                        Intent intent = new Intent(MainActivity.this, login.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("EXIT", true);
                        startActivity(intent);
                    }
                });
                builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog quit = builder.create();
                quit.show();
                //menggunakan intent untuk berpindah ke activity sebelumnya
            }
        });
    }


//    public void exit(View View) {
//
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Yakin Ingin Keluar ?");
//        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                finish();
//            }
//        });
//        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                dialogInterface.dismiss();
//            }
//        });
//        AlertDialog quit = builder.create();
//        quit.show();
//    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Yakin Ingin Keluar ?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(MainActivity.this, login.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog quit = builder.create();
        quit.show();
    }


}
