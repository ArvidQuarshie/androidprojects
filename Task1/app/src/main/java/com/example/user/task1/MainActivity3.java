package com.example.user.task1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 5/24/16.
 */
public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }
    public void listen(View view) {
        Button button;
        button =(Button)findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class );
                startActivity(intent);
            }



}
