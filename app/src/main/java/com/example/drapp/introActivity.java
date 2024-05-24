package com.example.drapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class introActivity extends AppCompatActivity {
    ImageView logo;
    LottieAnimationView lottieAnimationView;
    private static int SPLASH_TIME_OUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        logo=findViewById(R.id.logo);
        lottieAnimationView=findViewById(R.id.lottie);

        logo.animate().translationY(-5000).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
        nextScreen();
    }

    private void nextScreen() {
        new Handler().postDelayed(()-> {
            Intent intent=new Intent(introActivity.this, loginActivity.class);
            startActivity(intent);
        }, SPLASH_TIME_OUT);
    }



}