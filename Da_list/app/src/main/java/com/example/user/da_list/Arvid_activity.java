package com.example.user.da_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Arvid_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arvid_activity);
       populatelistview();

    }

    private void populatelistview() {
        String [] mystuff ={"fisi","backend", "frontend"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.da_corta,mystuff);

        ListView list = (ListView) findViewById(R.id.listViewz);
        list.setAdapter(adapter);

    }
}
