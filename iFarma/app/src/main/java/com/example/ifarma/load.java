package com.example.ifarma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Explode;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class load extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostraract();
            }
        }, 5000);
    }
    private void mostraract() {
        Intent intent = new Intent(
                load.this, inicial.class
        );
        startActivity(intent);
        finish();

    }
}