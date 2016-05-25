package com.example.user.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            setContentView(R.layout.MainActivity);
            Thread timerThread = new Thread(){
                public void run(){
                    try{
                        sleep(3000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }finally{
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
            };
            timerThread.start();
        }
        @Override
        protected void onPause() {
            // TODO Auto-generated method stub
            super.onPause();
            finish();
        }

    }


}
