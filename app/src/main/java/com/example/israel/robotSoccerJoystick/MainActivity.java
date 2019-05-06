package com.example.israel.robotSoccerJoystick;

import io.github.controlwear.virtual.joystick.android.JoystickView;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private Button btnOpciones;
    private Button btnDisparador;


    private TextView mTitleRight;
    private TextView mTextViewAngleRight; //angulo
    private TextView mTextViewStrengthRight; //fuerza
    private TextView mTextViewCoordinateRight; //frecuencia cada 50 ms

    private TextView mTitleLeft;
    private TextView mTextViewAngleLeft;
    private TextView mTextViewStrengthLeft;
    private TextView mTextViewCoordinateLeft;

    //private TextView dato;
    public String leftV ="100";
    public String rightV  ="100";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //joystick R

        mTextViewAngleRight = (TextView) findViewById(R.id.textView_angle_right);
        mTextViewStrengthRight = (TextView) findViewById(R.id.textView_strength_right);
        mTextViewCoordinateRight = findViewById(R.id.textView_coordinate_right);


        //metodos
        final JoystickView joystickRight = (JoystickView) findViewById(R.id.joystickView_right);
        joystickRight.setOnMoveListener(new JoystickView.OnMoveListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onMove(int angle, int strength) {

                mTextViewAngleRight.setText(angle + "°");
                //mTextViewStrengthRight.setText(strength + "%"); //velocidad, 101-200 adelante, 100 apagado, 99-0 reversa

                if(angle>=0 && angle<=180){ //parte superior
                    rightV = String.valueOf(strength +100);
                    mTextViewStrengthRight.setText(strength+100 + "%");
                    if(angle>60 && angle<120) {
                        System.out.println("240/" + leftV + "/" + rightV + "/0/" + "247");
                        sendMessage("240/" + leftV + "/" + rightV + "/0/" + "247");
                    }
                    else {
                        System.out.println("240/" + 100 + "/" + 100 + "/0/" + "247");
                        sendMessage("240/" + 100 + "/" + 100 + "/0/" + "247");
                    }

                }
                else { //parte inferior
                    rightV = String.valueOf(-strength+100);
                    mTextViewStrengthRight.setText(-strength+100 + "%");

                    if (angle>240 && angle<300){
                    System.out.println("240/"+leftV+"/"+rightV+"/0/"+"247");

                    //sendMessage(mTextViewStrengthRight.getText().toString().replace("%",""));
                    sendMessage("240/"+leftV+"/"+rightV+"/0/"+"247");}
                    else{
                        System.out.println("240/" + 100 + "/" + 100 + "/0/" + "247");
                        sendMessage("240/" + 100 + "/" + 100 + "/0/" + "247");
                    }
                }


                mTextViewCoordinateRight.setText(
                        String.format("%03d:%03d",
                                joystickRight.getNormalizedX(),
                                joystickRight.getNormalizedY())
                );
            }
        });

        //Joystick L
        mTextViewAngleLeft = (TextView) findViewById(R.id.textView_angle_left);
        mTextViewStrengthLeft = (TextView) findViewById(R.id.textView_strength_left);
        mTextViewCoordinateLeft = findViewById(R.id.textView_coordinate_left);

        final JoystickView joystickLeft = (JoystickView) findViewById(R.id.joystickView_left);
        joystickLeft.setOnMoveListener(new JoystickView.OnMoveListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onMove(int angle, int strength) {
                mTextViewAngleLeft.setText(angle + "°");
                //mTextViewStrengthLeft.setText(strength + "%");
                if(angle>=0 && angle<=180){
                    leftV = String.valueOf(strength +100);
                    mTextViewStrengthLeft.setText(strength+100 + "%");

                    if(angle>60 && angle<120){
                    System.out.println("240/"+leftV+"/"+rightV+"/0/"+"247");

                    //sendMessage(mTextViewStrengthLeft.getText().toString().replace("%",""));
                    sendMessage("240/"+leftV+"/"+rightV+"/0/"+"247");
                    }
                    else {
                        System.out.println("240/" + 100 + "/" + 100 + "/0/" + "247");
                        sendMessage("240/" + 100 + "/" + 100 + "/0/" + "247");
                    }
                }
                else{
                    leftV = String.valueOf(-strength+100);
                    mTextViewStrengthLeft.setText(-strength+100 + "%");
                    //sendMessage(mTextViewStrengthLeft.getText().toString().replace("%",""));
                    if (angle>240 && angle<300){
                    System.out.println("240/"+leftV+"/"+rightV+"/0/"+"247");
                    sendMessage("240/"+leftV+"/"+rightV+"/0/"+"247");
                    }
                    else{
                        System.out.println("240/" + 100 + "/" + 100 + "/0/" + "247");
                        sendMessage("240/" + 100 + "/" + 100 + "/0/" + "247");
                    }


                }
                mTextViewCoordinateLeft.setText(
                        String.format("%03d:%03d",
                                joystickLeft.getNormalizedX(), //Devuelve la coordenada X relativa del centro del botón relacionado a la esquina virtual superior izquierda del borde
                                joystickLeft.getNormalizedY())
                );
            }
        });


        //botones - Opciones
        btnOpciones=(Button)findViewById(R.id.btnOpcion);

        btnOpciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=new Intent(MainActivity.this,Option.class);
                Intent in=new Intent(MainActivity.this,Option.class);
                startActivity(in);
            }
        });

        btnDisparador=(Button)findViewById(R.id.btnBall);

        btnDisparador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    System.out.println("240/" + 200 + "/" + 200 + "/0/" + "247");
                    sendMessage("240/" + 200 + "/" + 200 + "/0/" + "247");
                    System.out.println("240/" + 200 + "/" + 200 + "/0/" + "247");
                    sendMessage("240/" + 200 + "/" + 200 + "/0/" + "247");
                    System.out.println("240/" + 200 + "/" + 200 + "/0/" + "247");
                    sendMessage("240/" + 200 + "/" + 200 + "/0/" + "247");

                    Thread.sleep(500);
                    sendMessage("240/" + 100 + "/" + 100 + "/0/" + "247");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    //Metodo socket -- envia los datos de los Joystick al servidor ESP
    public void sendMessage(String dato) { //public void sendMessage(View v) {
        MessageSocket messageSender = new MessageSocket();
        messageSender.execute(dato);

    }
}

