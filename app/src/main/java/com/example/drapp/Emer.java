package com.example.drapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Emer extends AppCompatActivity {

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    private ArrayList<String> arrayList2;
    private ArrayAdapter<String> adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emer);

        ListView listView= findViewById(R.id.Loginbtn);
        ListView listView1 = findViewById(R.id.l2);


        String [] items={"15","911", "1122","115","16","1787"};

        String [] items2={"Police Help","Emergency", "Ambulance Service","Edhi Control Rooom","Fire Birgade","Complain Centre"};


        arrayList=new ArrayList<>(Arrays.asList(items));
        adapter=new ArrayAdapter<String>(Emer.this, R.layout.activity_list_num, R.id.textView, arrayList);
        listView.setAdapter (adapter);

        arrayList2=new ArrayList<>(Arrays.asList(items2));
        adapter2=new ArrayAdapter<String>(Emer.this, R.layout.activity_list_num2, R.id.textView, arrayList2);
        listView1.setAdapter (adapter2);

       

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Intent di =new Intent (Intent.ACTION_DIAL);
                di.setData(Uri.parse("tel:"+ adapter.getItem(position)));
                startActivity(di);
            }
        });

    }
}