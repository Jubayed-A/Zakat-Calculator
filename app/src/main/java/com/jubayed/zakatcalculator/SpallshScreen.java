package com.jubayed.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SpallshScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spallsh_screen);

        /*

        // splash screen method 1

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SpallshScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1500);*/

        // this the second method of splash screen

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SpallshScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1500);

    }
}