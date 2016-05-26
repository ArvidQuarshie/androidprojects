

package com.example.user.Populate;

 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.support.v7.widget.ListViewCompat;
 import android.widget.ArrayAdapter;

 public class ListView extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_list_view);

populatelistview();
}

private void populatelistview(){

String[]stuff={"girl", "boy","dog","cat"};

ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, R.layout.activity_list_view,stuff);
ListViewCompat list =(ListViewCompat) findViewById (R.id.mylist);
list.setAdapter(adapter);
}



};
