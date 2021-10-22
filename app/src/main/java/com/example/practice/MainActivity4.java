package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    private Button sun,mon,tue,wed,thur,fri,sat,next;
    private TextView tLbl,lbl;
    int count;
    private int sunCount;
    private int monCount;
    private int tueCount;
    private int wedCount;
    private int thurCount;
    private int friCount;
    private int satCount;
    private ArrayList<String> tDays;
    private TextView days;
    String txt;
    boolean isChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tLbl=findViewById(R.id.trainingDayslbl);
        lbl=findViewById(R.id.days);
        sun= findViewById(R.id.sunBtn_C3C3C3);
        mon=findViewById(R.id.monBtn);
        tue=findViewById(R.id.tueBtn);
        wed=findViewById(R.id.wedBtn);
        thur=findViewById(R.id.thruBtn);
        fri=findViewById(R.id.friBtn);
        sat=findViewById(R.id.satBtn);
        days= findViewById(R.id.days);
        next= findViewById(R.id.next);
         sunCount=0;
         isChoose=false;
        tDays= new ArrayList<>();
        count=0;

        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tDays.size()<5 || sunCount%2==1) {

                    sunCount++;
                color(sunCount,sun);
                activate();


            }}
        });


            mon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(tDays.size()<5|| monCount%2==1) {

                    monCount++;
                    color(monCount, mon);
                    activate();
                }}
            });


            tue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(tDays.size()<5|| tueCount%2==1) {
                        tueCount++;
                    color(tueCount, tue);
                    activate();

                }}
            });


            wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tDays.size()<5|| wedCount%2==1) {

                    wedCount++;
                color(wedCount,wed);
                activate();

            }}
        });



            thur.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View view) {
                    if(tDays.size()<5|| thurCount%2==1) {

                        thurCount++;
                    color(thurCount, thur);
                    activate();


                }}
            });


            fri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(tDays.size()<5|| friCount%2==1) {
                        friCount++;
                    color(friCount, fri);
                    activate();


                }}
            });



            sat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(tDays.size()<5|| satCount%2==1) {

                        satCount++;
                    color(satCount, sat);
                    activate();

                }}
            });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tDays.size()>=2){
                    goReminder();
                }
            }
        });
    }
    public void color(int c, Button btn){
        txt= (String) btn.getText();
        if(c%2==1){
            btn.setBackgroundColor(Color.parseColor("#ED0B8A"));
            tDays.add(txt);
            days.setText(tDays.toString()+ tDays.size());

        }
        else {
            btn.setBackgroundColor(Color.parseColor("#E3C6D0"));
             tDays.remove(txt);
            days.setText(tDays.toString()+ tDays.size());

        }
    }
    public void goReminder(){
        Intent intent= new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void activate(){
        if(tDays.size()>=2){
            next.setBackgroundColor(Color.parseColor("#48D0FE"));
        }
        else {
            next.setBackgroundColor(Color.parseColor("#D8D4D4"));


        }

    }
}