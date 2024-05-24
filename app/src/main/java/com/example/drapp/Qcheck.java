package com.example.drapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.Arrays;

public class Qcheck extends AppCompatActivity {
    ImageView logo;
    AutoCompleteTextView at;
    AutoCompleteTextView at1;
    AutoCompleteTextView at2;
    AutoCompleteTextView at3;
    LottieAnimationView lottieAnimationView;
    CheckBox c1;
    Button b;
    boolean check;
    private ArrayList<String> arrayList,arrayList2;
    private ArrayAdapter<String> adapter,adapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qcheck);

        String [] items={"Headache","Cough", "Stomach Pain"};

//for S1
        at = findViewById(R.id.at);
        arrayList=new ArrayList<>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(Qcheck.this, R.layout.activity_list_num, R.id.textView, arrayList);
        at.setAdapter (adapter);
// for S2
        at1 = findViewById(R.id.at1);
        arrayList=new ArrayList<>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(Qcheck.this, R.layout.activity_list_num, R.id.textView, arrayList);
        at1.setAdapter (adapter);


// for S3
        at2 = findViewById(R.id.at2);
        arrayList=new ArrayList<>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(Qcheck.this, R.layout.activity_list_num, R.id.textView, arrayList);
        at2.setAdapter (adapter);
//for S4
        at2 = findViewById(R.id.at3);
        arrayList=new ArrayList<>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(Qcheck.this, R.layout.activity_list_num, R.id.textView, arrayList);
        at2.setAdapter (adapter);

        b = findViewById(R.id.button);
        c1 = findViewById(R.id.c);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    b.setVisibility(View.VISIBLE);
                } else
                    b.setVisibility(View.GONE);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qcheck.this, splash2.class);
                startActivity(intent);
                finish();
            }
        });

        }
    }
