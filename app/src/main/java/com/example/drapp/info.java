package com.example.drapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class info extends AppCompatActivity {
    ImageView head,vir,cou,pai,col,hepa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        head=findViewById(R.id.headache);
        vir=findViewById(R.id.virus);
        cou=findViewById(R.id.cough);
        pai=findViewById(R.id.pain);
        col=findViewById(R.id.cold);
        hepa=findViewById(R.id.hepatitus);

        head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.amjmed.com/article/S0002-9343(17)30932-4/fulltext");
            }
        });
        vir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.worldometers.info/coronavirus/");
            }
        });
        cou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://my.clevelandclinic.org/health/symptoms/17755-cough#:~:text=A%20cough%20is%20a%20reflex,figure%20out%20what%27s%20going%20on.");
            }
        });
        pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.medicalnewstoday.com/articles/172943");
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