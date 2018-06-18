package com.example.crossbylite.fourtyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonregister1a;
    private Button buttonsearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.start_windowlay1);
        buttonregister1a = (Button) findViewById(R.id.buttonregister1);
        buttonsearch = findViewById(R.id.buttonsearch);

        buttonregister1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNewActivity(RegisterActivity.class);
            }
        });
        buttonsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    
    private void startNewActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}

