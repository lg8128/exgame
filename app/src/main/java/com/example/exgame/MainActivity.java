package com.example.exgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
 Random rnd=new Random();
 TextView tV,tV2,tV3,tV4,tV5,tV6;
 EditText ETN,ETN2,ETN3;
 ImageView iv,iv2,iv3;
 Button btn,btn2,btn3;
 int rnd1 = rnd.nextInt(90)+10;
 int rnd2 = rnd.nextInt(90)+10;
 int rnd3 = rnd.nextInt(90)+10;
 int rnd4 = rnd.nextInt(90)+10;
 String st1,st2,st3;
 int answer1,answer2,answer3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV = findViewById(R.id.tV);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        tV4 = findViewById(R.id.tV4);
        tV5 = findViewById(R.id.tV5);
        tV6 = findViewById(R.id.tV6);

        ETN = findViewById(R.id.ETN);
        ETN2 = findViewById(R.id.ETN2);
        ETN3 = findViewById(R.id.ETN3);

        iv =  findViewById(R.id.iv);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);

        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        tV.setText(""+rnd1);
        tV2.setText(""+rnd2);
        tV3.setText(""+(rnd1+rnd2));
        tV4.setText(""+rnd3);
        tV5.setText(""+(rnd1+rnd2+rnd3));
        tV6.setText(""+rnd4);


    }

    public void doron1(View view)
    { st1 = ETN.getText().toString();
        if (!st1.isEmpty())
        {
            answer1 = Integer.parseInt(st1);
            if(rnd1+rnd2 == answer1)
            {
                iv.setImageResource(R.drawable.v);
            }
            else
            {
                iv.setImageResource(R.drawable.x);
            }
            iv.setVisibility(View.VISIBLE);
            tV3.setVisibility(view.VISIBLE);
            tV4.setVisibility(view.VISIBLE);
            ETN2.setVisibility(view.VISIBLE);
            btn2.setVisibility(view.VISIBLE);



        }

    }

    public void doron2(View view)
    {st2 = ETN2.getText().toString();


    }

    public void doron3(View view) {

    }

    public void doronkiller369(View view) {

    }

    public void oC(View view) {
    }
}