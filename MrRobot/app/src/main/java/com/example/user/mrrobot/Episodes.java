package com.example.user.mrrobot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by user on 5/29/16.
 */
public class Episodes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.episodes);

        String [] episodes= {"hellofriend","zeros and ones","debug mkv","daemons" , "exploits.wmv","brave traveller","viewsource","white rose","zero day",""};
        ListAdapter myadapter= new ArrayAdapter <String> (this,android.R.layout.simple_list_item_1,episodes);
        ListView listViewd = (ListView) findViewById(R.id.listViewd);
        listViewd.setAdapter(myadapter);


    }
}
