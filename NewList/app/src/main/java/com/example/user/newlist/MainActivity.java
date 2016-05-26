package com.example.user.newlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populatelistview();
    }

    private void populatelistview(){

        String[]stuff={"girl", "boy","dog","cat"};

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,,stuff);
        ListView newlist =(ListView) findViewById (R.id.mylist);
        newlist.setAdapter(adapter);
    };
    }

