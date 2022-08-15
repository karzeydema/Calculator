package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialButton ac,firstbracket,secondbracket, divide,seven,eight,nine,multiply,four,five,six,minus,one,two,three,plus,equals;
    TextView output,display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(TextView) findViewById(R.id.display);
        output=(TextView)  findViewById(R.id.result);

        idassign(ac,R.id.AC);
        idassign(firstbracket,R.id.firstBracket);
        idassign(secondbracket,R.id.secondbracket);
        idassign(divide,R.id.divide);
        idassign(seven,R.id.seven);
        idassign(eight,R.id.eight);
        idassign(nine,R.id.nine);
        idassign(multiply,R.id.multiply);
        idassign(four,R.id.four);
        idassign(five,R.id.five);
        idassign(six,R.id.six);
        idassign(minus,R.id.minus);
        idassign(one,R.id.one);
        idassign(two,R.id.two);
        idassign(three,R.id.three);
        idassign(plus,R.id.plus);
        idassign(equals,R.id.equals);


    }


void idassign(MaterialButton buton, int id){
        buton=findViewById(id);
        buton.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        MaterialButton bttn=(MaterialButton)  view;
        String bttntext=bttn.getText().toString();
        String numbers=display.getText().toString();
        if(bttn.equals("AC")){
           display.setText("");
           output.setText("0");
        }


    }
}