package com.example.maxfitdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            int secondsDelayed = 1;
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    finish();
                }
            }, secondsDelayed * 2000);
        }
}
