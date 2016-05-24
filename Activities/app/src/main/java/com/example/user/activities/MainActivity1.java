package com.example.user.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 5/24/16.
 */
public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
        addButtonClicklistener();

    }
    public void addButtonClicklistener(){
        Button button;

        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){
//                Intent intent = new Intent(MainActivity1.this, MainActivity.class );
//                startActivity(intent);
                finish();
            }

        });
    }
}
