package com.example.user.mrrobot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 5/29/16.
 */
public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(40000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Intro.this, Episodes.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();



    }
}