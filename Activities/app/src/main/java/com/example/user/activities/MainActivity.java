package com.example.user.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButtonClicklistener();
        addButtonClicklistener1();

    }
    public void addButtonClicklistener(){
        Button button;

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(MainActivity.this, MainActivity1.class );
                startActivity(intent);
            }

        });
    }
    public void addButtonClicklistener1(){
        Button button;
        final Context context= this;

        button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(context, MainActivity1.class );
                startActivity(intent);
            }

        });
    }
}
