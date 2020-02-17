package com.company;

import java.io.*;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in));
	    String host = "localhost";
	    int puerto = 6000;

        System.out.println("PROGRAMA CLIENTE INICIADO...");
        Socket cliente = new Socket(host, puerto);

        //Creo el flujo de entrada a traves del cual recibo la identificación de conexión
        DataInputStream fEntrada = new DataInputStream(cliente.getInputStream());
        //Creo el flujo de salida a través del cual envio la posición a buscar
        DataOutputStream fSalida = new DataOutputStream(cliente.getOutputStream());

        int identificador = fEntrada.readInt();
        System.out.println("TE HAS CONECTADO CON NÚMERO DE IDENTIFICACIÓN " + identificador);

        int posicion;

        do {
            //Envio la posición a buscar
            System.out.println("Introduce una posición de búsqueda (-1 para salir):");
            posicion = Integer.parseInt(lee.readLine());
            fSalida.writeInt(posicion);

            if (posicion <= 4) {
                if (posicion != -1) {
                    //Obtengo el dato del profesor en la posición enviada
                    ObjectInputStream inProfesor = new ObjectInputStream(cliente.getInputStream());
                    Profesor p = (Profesor) inProfesor.readObject();
                    System.out.println(p.toString());
                }
            } else {
                System.out.println("La máxima posición posible es 4");
            }

        }while(posicion != -1);

        fEntrada.close();
        fSalida.close();
        cliente.close();
    }
}
