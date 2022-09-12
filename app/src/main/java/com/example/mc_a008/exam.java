package com.example.mc_a008;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class exam extends AppCompatActivity {
    char[] arr={'a','b','c','d','e','f'};
    ImageView img;
    Button b1;
    Button b2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        img = findViewById(R.id.img);
        //int s= (int) (Math.random()*(6-1+1)+1);
        Random ran = new Random();
        int a = ran.nextInt(6)+1;
        int i = getResources().getIdentifier("com.example.mc_a008:drawable/" + arr[a], null, null);
        img.setImageResource(i);
        b1=findViewById(R.id.ans1);
        result=findViewById(R.id.result);
        b2=findViewById(R.id.ans2);
        int a2 = ran.nextInt(1);
        if (a2 == 1) {
            b1.setText(Integer.toString(a));
            b2.setText(Integer.toString(a - 1));
        } else {
            b1.setText(Integer.toString(a + 1));
            b2.setText(Integer.toString(a));

        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText()==Integer.toString(a)) {
                    result.setText("incorrect");
                }
                else
                    result.setText("correct");


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText()==Integer.toString(a)) {
                    result.setText("incorrect");
                }
                else
                    result.setText("correct");


            }
        });



    }
}