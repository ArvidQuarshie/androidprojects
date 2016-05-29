package com.example.user.charged;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 5/25/16.
 */
public class LogIn  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void loginclick(View view) {
        Button button;
        button = (Button) findViewById(R.id.buttonLogIn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(LogIn.this, JohnSnow.class);
                startActivity(intent);

            }
        });


    }

    }
