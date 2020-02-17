package com.company;

import java.io.*;
import java.net.Socket;

public class HiloServidor extends Thread {
    Socket socket = null;
    int id;
    Profesor[] profesores;

    public HiloServidor(Socket socket, int id, Profesor[] profesores) {
        this.socket = socket;
        this.id = id;
        this.profesores = profesores;
    }

    @Override
    public void run(){
        try {
            int posicionABuscar = 0;

                //Creo un flujo de salida al cliente para enviar su identificador
                OutputStream salida = socket.getOutputStream();
                DataOutputStream fSalida = new DataOutputStream(salida);
                //Envio el identificador al cliente
                fSalida.writeInt(id);

            while(posicionABuscar != -1) {
                //Creo el flujo de entrada del cliente para recibir la posición en la que buscar
                InputStream entrada = null;
                entrada = socket.getInputStream();
                DataInputStream fEntrada = new DataInputStream(entrada);
                posicionABuscar = fEntrada.readInt();

                if (posicionABuscar != -1) {
                    //Obtengo el objeto en la posición recibida y lo envio al cliente
                    Profesor p = profesores[posicionABuscar];
                    ObjectOutputStream outProfesor = new ObjectOutputStream(socket.getOutputStream());
                    outProfesor.writeObject(p);
                }
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
