package com.example.drapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class popup1 extends AppCompatActivity {

    ImageView virus,col,hepa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup1);

        virus=findViewById(R.id.virus);
        col=findViewById(R.id.cold);
        hepa=findViewById(R.id.hepatitus);

        virus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.worldometers.info/coronavirus/");
            }
        });

        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.mayoclinic.org/diseases-conditions/common-cold/symptoms-causes/syc-20351605");
            }
        });

        hepa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.webmd.com/hepatitis/digestive-diseases-hepatitis-c");
            }
        });


    }
    private void gotoUrl(String s) {
        Uri uri =Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}