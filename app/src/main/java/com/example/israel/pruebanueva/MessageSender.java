package com.example.israel.pruebanueva;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 */
public class MessageSender extends AsyncTask<String,Void,String>
{
    @Override
    protected String doInBackground(String... params) {

        String message = params[0];
        try
        {
            //Conexion con el modulo ESP - IP y puerto fijos
            Socket mySocket = new Socket("192.168.4.1",9700);
            DataOutputStream dos = new DataOutputStream(mySocket.getOutputStream());
            dos.writeUTF(message);
            dos.close();
            mySocket.close();

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
