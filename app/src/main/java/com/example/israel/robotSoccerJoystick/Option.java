package com.example.israel.robotSoccerJoystick;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Option extends AppCompatActivity {

    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        e1 = (EditText) findViewById(R.id.editText);
    }

    public void sendMessage(View v) {
        MessageSocket messageSender = new MessageSocket();
        messageSender.execute(e1.getText().toString());
        System.out.println(e1.getText().toString());
    }
}

