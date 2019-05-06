package com.example.israel.robotSoccerJoystick;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class MessageSocket extends AsyncTask<String,Void,String>
{
    @Override
    protected String doInBackground(String... params) {

        String message = params[0];
        try
        {
            //Conexion TCP con el modulo ESP - IP y puerto fijos
            Socket mySocket = new Socket("192.168.4.1",9700);
            System.out.println("Connected to server..");
            DataOutputStream data = new DataOutputStream(mySocket.getOutputStream());
            data.writeUTF(message);
            data.close();
            mySocket.close();

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
