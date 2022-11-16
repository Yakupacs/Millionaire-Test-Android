package com.example.millionaire_test_java;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class ActivityStart extends AppCompatActivity {

    private Button buttonStart;
    private Button buttonInfo;
    private Button buttonHowToPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityTest();
            }
        });

        buttonInfo = (Button) findViewById(R.id.buttonInfo);
        buttonInfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityInfo();
            }
        });

        buttonHowToPlay = (Button) findViewById(R.id.buttonHowToPlay);
        buttonHowToPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityHowToPlay();
            }
        });
    }

    public void openActivityTest()
    {
        Intent intent = new Intent(this, ActivityTest.class);
        startActivity(intent);
    }

    public void openActivityInfo()
    {
        Intent intent = new Intent(this, ActivityInfo.class);
        startActivity(intent);
    }

    public void openActivityHowToPlay()
    {
        Intent intent = new Intent(this, ActivityHowToPlay.class);
        startActivity(intent);
    }
}