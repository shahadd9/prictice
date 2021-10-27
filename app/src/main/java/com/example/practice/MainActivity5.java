package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    Button home;
    Button gym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        home = findViewById(R.id.homeBtn);
        gym= findViewById(R.id.gymBtn);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goEqupment2();
            }
        });

        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goEqupment2();
            }
        });
    }

    public void goEqupment2(){
        Intent intent= new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}