package com.example.user.listviewbanas;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivityBanas extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_banas);

        String [] stuff = {"what", "are","you","saying"};

        ListAdapter theadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stuff);
        ListView thelistview = (ListView) findViewById(R.id.listViewb);
        thelistview.setAdapter(theadapter);
    }
}
