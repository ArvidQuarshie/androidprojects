package com.example.user.task1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.user.task1.R.layout.activity_main2;

/**
 * Created by user on 5/24/16.
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main2);
        addButtonClicklistener();
        addButtonClicklistener1();
        addButtonClicklistener2();




    }

    private void addButtonClicklistener1() {
        Button button;
        button = (Button) findViewById(R.id.girls);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(intent);

            }
        });

}





    private void addButtonClicklistener2() {
        Button button;
        button =(Button)findViewById(R.id.gold);
        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
            }

        });
    }
            public void addButtonClicklistener(){
        Button button;
        button = (Button)findViewById(R.id.diamonds);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class );
                startActivity(intent);
            }

        });


    }
}



