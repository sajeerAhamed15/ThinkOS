package com.thinkos.thinkos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void message(View view) {
    }

    public void help(View view) {
    }

    public void settings(View view) {
    }

    public void twitter(View view) {
    }

    public void chrome(View view) {
    }

    public void facebook(View view) {
    }

    public void youtube(View view) {
    }

    public void gallery(View view) {
    }

    public void music(View view) {
    }

    public void alarm(View view) {
        startActivity(new Intent(MainActivity.this,Alarm.class));
    }
}
