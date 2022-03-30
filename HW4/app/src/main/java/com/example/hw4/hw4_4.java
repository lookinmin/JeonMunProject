package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class hw4_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw44);

        TextView Text1 = findViewById(R.id.Text1);
        Switch check = findViewById(R.id.check);
        TextView Text2 = findViewById(R.id.Text2);

        RadioGroup VGroup = findViewById(R.id.VGroup);
        RadioButton ver_Q = findViewById(R.id.ver_Q);
        RadioButton ver_R = findViewById(R.id.ver_R);
        RadioButton ver_S = findViewById(R.id.ver_S);
        ImageView verImg = findViewById(R.id.verImg);
        Button end = findViewById(R.id.end);
        Button first = findViewById(R.id.first);
        Button next = findViewById(R.id.next);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(check.isChecked()){
                    VGroup.setVisibility(View.VISIBLE);
                    ver_Q.setVisibility(View.VISIBLE);
                    ver_R.setVisibility(View.VISIBLE);
                    ver_S.setVisibility(View.VISIBLE);
                    verImg.setVisibility(View.VISIBLE);
                    Text2.setVisibility(View.VISIBLE);

                    ver_Q.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(ver_Q.isChecked()){
                                verImg.setImageResource(R.drawable.ver_q);
                            }
                        }
                    });

                    ver_R.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(ver_R.isChecked()){
                                verImg.setImageResource(R.drawable.ver_r);
                            }
                        }
                    });

                    ver_S.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(ver_S.isChecked()){
                                verImg.setImageResource(R.drawable.ver_s);
                            }
                        }
                    });
                }
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.finishAffinity(hw4_4.this);
                System.exit(0);
            }
        });

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(hw4_4.this, hw4_4.class));
            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hw4_4.this, Mission.class);
                startActivity(intent);
            }
        });
    }
}