package com.example.israel.pruebanueva;


import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP extends AppCompatActivity {

    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcp);
        e1 = (EditText) findViewById(R.id.editText);
    }

    public void sendMessage(View v) {
        MessageSender messageSender = new MessageSender();
        messageSender.execute(e1.getText().toString());

    }
}

