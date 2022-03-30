package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class hw4_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw42);

        CheckBox ChkAgree = findViewById(R.id.ChkAgree);
        RadioGroup Rgroup1 = findViewById(R.id.Rgroup1);
        RadioButton RdoDog = findViewById(R.id.RdoDog);
        RadioButton RdoCat = findViewById(R.id.RdoCat);
        RadioButton RdoRabbit = findViewById(R.id.RdoRabbit);
        Button BtnOK = findViewById(R.id.BtnOK);
        TextView Text2 = findViewById(R.id.Text2);
        ImageView ImgPet = findViewById(R.id.ImgPet);

        ChkAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ChkAgree.isChecked()){
                    Rgroup1.setVisibility(View.VISIBLE);
                    RdoDog.setVisibility(View.VISIBLE);
                    RdoCat.setVisibility(View.VISIBLE);
                    RdoRabbit.setVisibility(View.VISIBLE);
                    BtnOK.setVisibility(View.VISIBLE);
                    ImgPet.setVisibility(View.VISIBLE);
                    Text2.setVisibility(View.VISIBLE);


                    RdoDog.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(RdoDog.isChecked()){
                                BtnOK.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        ImgPet.setImageResource(R.drawable.dog);
                                    }
                                });

                            }
                        }
                    });

                    RdoCat.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(RdoCat.isChecked()){
                                BtnOK.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        ImgPet.setImageResource(R.drawable.cat);
                                    }
                                });

                            }
                        }
                    });


                    RdoRabbit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(RdoRabbit.isChecked()){
                                BtnOK.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        ImgPet.setImageResource(R.drawable.rabbit);
                                    }
                                });

                            }
                        }
                    });
                }
            }
        });


        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hw4_2.this, hw4_3.class);
                startActivity(intent);
            }
        });
    }
}