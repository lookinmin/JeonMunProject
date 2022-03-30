package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Mission extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mission);

        Button btn_up = findViewById(R.id.btn_up);
        Button btn_down = findViewById(R.id.btn_down);
        ImageView img1 = findViewById(R.id.img1);
        ImageView img2 = findViewById(R.id.img2);

        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(R.drawable.karina);
                img2.setImageResource(0);
            }
        });

        btn_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img2.setImageResource(R.drawable.karina);
                img1.setImageResource(0);
            }
        });
    }
}