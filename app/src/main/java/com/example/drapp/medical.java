package com.example.drapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class medical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);

        LinearLayout l1 = findViewById(R.id.Quick);
        LinearLayout l2 = findViewById(R.id.info);
        LinearLayout l3 = findViewById(R.id.Hist);
        LinearLayout l4 = findViewById(R.id.Emer);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(medical.this, Qcheck.class);
                startActivity(i);
            }
        });


        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(medical.this, info.class);
                startActivity(i);
            }
        });


        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(medical.this, History.class);
                startActivity(i);
            }
        });


        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(medical.this, Emer.class);
                startActivity(i);
            }
        });
    }

}