package com.example.hw2_2_20211336;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView img;
    float degree=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.img2);
        setTitle("  연습문제 4-9");


        btn=(Button)findViewById(R.id.btn);
        img=(ImageView)findViewById(R.id.img);
        img.setImageResource(R.drawable.fox2);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                degree=degree+10;
                img.setRotation(degree);
            }
        });
    }
}