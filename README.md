# robotSoccerJoystick - Motores Dinamixeles

Se realizó en Android Studio una aplicación que funciona como cliente y envía una trama de datos al robot-soccer servidor (microcontroladores ESP - MicroPython), utiliza una conexión por Wireless y el Protocolo de Control de Transmisión (TCP). 
Este protocolo se encarga de crear “conexiones” entre sí para que se cree un flujo de datos. Este proceso garantiza que los datos sean entregados en destino sin errores y en el mismo orden en el que salieron. 

Permite controlar por medio de una implementación que controla dos variables, el ángulo de movimiento y el movimiento de la pantalla táctil de los Joysticks.

Tipo de Locomoción diferencial: El cambio de dirección se realiza modificando la velocidad relativa de las ruedas a 
Izquierda y Derecha.

# Comunidad Fun Python Ecuador
https://github.com/FunPythonEC/Robot_soccer
