package com.example.user.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] animals= {"dogs","cats","frogs","chicken"};
        ListAdapter myadapter= new ArrayAdapter <String> (this,android.R.layout.simple_list_item_1,animals);
        ListView listViewa = (ListView) findViewById(R.id.listViewa);
        listViewa.setAdapter(myadapter);
        listViewa.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }

        );
    }
}
