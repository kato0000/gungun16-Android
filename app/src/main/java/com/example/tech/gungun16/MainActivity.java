package com.example.tech.gungun16;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private Button[] button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button = new Button[5];
//        button[0] = (Button) findViewById(R.id.button);
//        button[1] = (Button) findViewById(R.id.button2);
//        button[2] = (Button) findViewById(R.id.button3);
//        button[3] = (Button) findViewById(R.id.button4);
//        button[4] = (Button) findViewById(R.id.button5);
//
//        for(int i = 0; i > 5; i++) {
//            button[i].setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    onActiveClick(view);
//                }
//            });
//        }

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });
    }

    public void onActiveClick(View view){
        switch (view.getId()){
            case R.id.button2:
                Intent intent = new Intent(this, assessmentActivity.class);
                startActivity(intent);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(this, assessmentActivity.class);
                startActivity(intent2);
                break;
            case R.id.button4:
                Intent intent3 = new Intent(this, assessmentActivity.class);
                startActivity(intent3);
                break;
            case R.id.button5:
                Intent intent4 = new Intent(this, assessmentActivity.class);
                startActivity(intent4);
                break;
        }
    }
}
