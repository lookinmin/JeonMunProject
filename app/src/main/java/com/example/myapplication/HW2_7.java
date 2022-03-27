package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class HW2_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw27);

        EditText txt =  findViewById(R.id.txt);
        Button btnTxt = findViewById(R.id.btnTxt);
        Button btnUrl = findViewById(R.id.btnUrl);
        RadioButton Karina = findViewById(R.id.Karina);
        RadioButton Winter = findViewById(R.id.Winter);
        ImageView img = findViewById(R.id.img);


        btnTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), txt.getText(), Toast.LENGTH_LONG).show();
            }
        });

        btnUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.valueOf(txt.getText())));
                startActivity(intent);
            }
        });

        Karina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.karina);
            }
        });

        Winter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.winter);
            }
        });
    }


}
