package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView result;
Button add,sub,pro,div;
EditText num1,num2;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        div=(Button) findViewById(R.id.div);
        pro=(Button) findViewById(R.id.pro);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num_one=num1.getText().toString();
                String num_two=num2.getText().toString();
                Double a=Double.parseDouble(num_one);
                Double b=Double.parseDouble(num_two);
                Double c=a+b;
                String res=c.toString();
                result.setText(res);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num_one=num1.getText().toString();
                String num_two=num2.getText().toString();
                Double a=Double.parseDouble(num_one);
                Double b=Double.parseDouble(num_two);
                Double c=a-b;
                String res=c.toString();
                result.setText(res);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num_one=num1.getText().toString();
                String num_two=num2.getText().toString();
                Double a=Double.parseDouble(num_one);
                Double b=Double.parseDouble(num_two);
                Double c=a*b;
                String res=c.toString();
                result.setText(res);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num_one=num1.getText().toString();
                String num_two=num2.getText().toString();
                Double a=Double.parseDouble(num_one);
                Double b=Double.parseDouble(num_two);
                Double c=a/b;
                String res=c.toString();
                result.setText(res);
            }
        });
    }
}