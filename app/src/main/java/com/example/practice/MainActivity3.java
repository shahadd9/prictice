package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
public class MainActivity3 extends AppCompatActivity {

    Button pickDaysBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
pickDaysBtn=findViewById(R.id.pickDaysBtn);
        SeekBar seekBar = (SeekBar)findViewById(R.id.lvlSeekBar);
        final TextView seekBarValue = (TextView)findViewById(R.id.seekBarValue);
        TextView tLvl= findViewById(R.id.lvl);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue.setText(String.valueOf(progress)+"/100");
                int lvl=progress;
                if(lvl<=33){
                    tLvl.setText("Beginner");
                }
                else if(lvl>33 && lvl<= 66){
                    tLvl.setText("Intermediate");
                }
                else{
                    tLvl.setText("Professional");

                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
        pickDaysBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                goTrainingDays();
                }


        });
    }
    public void goTrainingDays(){
        Intent intent= new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

}