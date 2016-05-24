package com.example.user.task1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 5/24/16.
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButtonClicklistener();
        addButtonClicklistener1();
    }

    private void addButtonClicklistener1() {
        Button button;
        button =(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class );
                startActivity(intent);
            }





    public void addButtonClicklistener(){
        Button button;
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class );
                startActivity(intent);
            }

        });


    }
}


