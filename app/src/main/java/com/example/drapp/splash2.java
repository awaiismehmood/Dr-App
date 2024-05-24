package com.example.drapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class splash2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        splash();
    }


    public void splash(){


        LottieAnimationView lottieAnimationView;

        lottieAnimationView=findViewById(R.id.lottie);

        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);

        new Handler().postDelayed(()-> {
            Intent intent=new Intent(splash2.this, Dashboard.class);
            startActivity(intent);
            finish();
        }, 2000);

    }

}
