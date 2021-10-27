package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    private Button equBtn;
    private CheckBox dmbl;
    private CheckBox barbell;
    private CheckBox ball;
    private CheckBox jumpR;
    private CheckBox ktl;
    private CheckBox pullup;
    private  CheckBox btlR;
    private CheckBox band;
    private ArrayList<String> equpmtList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        equBtn= findViewById(R.id.equBtn);
        dmbl=findViewById(R.id.dumbble);
        barbell=findViewById(R.id.barbell);
        ball=findViewById(R.id.ball);
        jumpR=findViewById(R.id.jumpR);
        ktl=findViewById(R.id.kettle);
        pullup=findViewById(R.id.pullUp);
        btlR=findViewById(R.id.battleR);
        band=findViewById(R.id.band);
        equpmtList=new ArrayList<>();

    }
}