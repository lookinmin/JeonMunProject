package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class hw4_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw43);

        EditText Edit1 = findViewById(R.id.Edit1);
        EditText Edit2 = findViewById(R.id.Edit2);
        Button BtnAdd = findViewById(R.id.BtnAdd);
        Button BtnSub = findViewById(R.id.BtnSub);
        Button BtnMul = findViewById(R.id.BtnMul);
        Button BtnDiv = findViewById(R.id.BtnDiv);
        Button remain = findViewById(R.id.remain);
        TextView TextResult = findViewById(R.id.TextResult);

        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Edit1.getText().length() == 0 || Edit2.getText().length() == 0){
                    Toast.makeText(hw4_3.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    float num1 = Float.parseFloat(Edit1.getText().toString());
                    float num2 = Float.parseFloat(Edit2.getText().toString());
                    String result = Float.toString(num1+num2);
                    TextResult.setText(result);
                }
            }
        });

        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Edit1.getText().length() == 0 || Edit2.getText().length() == 0){
                    Toast.makeText(hw4_3.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    float num1 = Float.parseFloat(Edit1.getText().toString());
                    float num2 = Float.parseFloat(Edit2.getText().toString());
                    String result = Float.toString(num1-num2);
                    TextResult.setText(result);
                }
            }
        });

        BtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Edit1.getText().length() == 0 || Edit2.getText().length() == 0){
                    Toast.makeText(hw4_3.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    float num1 = Float.parseFloat(Edit1.getText().toString());
                    float num2 = Float.parseFloat(Edit2.getText().toString());
                    String result = Float.toString(num1*num2);
                    TextResult.setText(result);
                }
            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Edit1.getText().length() == 0 || Edit2.getText().length() == 0){
                    Toast.makeText(hw4_3.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    if(Edit2.getText().toString().equals("0")){
                        Toast.makeText(hw4_3.this, "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }else{
                        float num1 = Float.parseFloat(Edit1.getText().toString());
                        float num2 = Float.parseFloat(Edit2.getText().toString());
                        String result = Float.toString(num1/num2);
                        TextResult.setText(result);
                    }

                }
            }
        });

        remain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Edit1.getText().length() == 0 || Edit2.getText().length() == 0){
                    Toast.makeText(hw4_3.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    if(Edit2.getText().toString().equals("0")){
                        Toast.makeText(hw4_3.this, "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }else{
                        float num1 = Float.parseFloat(Edit1.getText().toString());
                        float num2 = Float.parseFloat(Edit2.getText().toString());
                        String result = Float.toString(num1%num2);
                        TextResult.setText(result);
                    }

                }
            }
        });

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hw4_3.this, hw4_4.class);
                startActivity(intent);
            }
        });


    }
}