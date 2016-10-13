package com.example.tech.gungun16;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button[] buttons;
    private Mission[] missions;
    private TextView[] textViews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        missions = new Mission[4];
        missions[0] = new Mission("はみがきをする");
        missions[1] = new Mission("手をあらう");
        missions[2] = new Mission("かたづける");
        missions[3] = new Mission("べんきょうをする");

        Button mButton1 = (Button) findViewById(R.id.mButton1);
        mButton1.setText(missions[0].name);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        Button mButton2 = (Button) findViewById(R.id.mButton2);
        mButton2.setText(missions[1].name);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        Button mButton3 = (Button) findViewById(R.id.mButton3);
        mButton3.setText(missions[2].name);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });

        Button mButton4 = (Button) findViewById(R.id.mButton4);
        mButton4.setText(missions[3].name);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActiveClick(view);
            }
        });
    }

    public void onActiveClick(View view){
        switch (view.getId()){
            case R.id.mButton1:
                Intent intent = new Intent(this, assessmentActivity.class);
                startActivity(intent);
                break;
            case R.id.mButton2:
                Intent intent2 = new Intent(this, assessmentActivity.class);
                startActivity(intent2);
                break;
            case R.id.mButton3:
                Intent intent3 = new Intent(this, assessmentActivity.class);
                startActivity(intent3);
                break;
            case R.id.mButton4:
                Intent intent4 = new Intent(this, assessmentActivity.class);
                startActivity(intent4);
                break;
        }
    }
}
