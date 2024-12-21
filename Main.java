/*
Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir al usuario que intente
adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que
el número generado.*/

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcionUsuario = 0;
        int numeroRandom = new Random().nextInt(100);
        int intentos = 5;
        String mensajeIntento = "intentos";


        do {
            System.out.println("Ingresa un número entre 0 y 100");
            if (intentos == 1){
                mensajeIntento = "intento";
            }
            System.out.println("Tienes " + intentos + " " + mensajeIntento);
            --intentos;
            opcionUsuario = input.nextInt();
            if (opcionUsuario < numeroRandom){
                System.out.println("El número secreto es mayor");
            }
            else if (opcionUsuario > numeroRandom){
                System.out.println("El número secreto es menor");
            }
            else{
                System.out.println("Adininaste el número");
            }
        }while(opcionUsuario != numeroRandom && intentos != 0);

        if (intentos == 0){
            System.out.println("Lo siento, se acabaron tus intentos. El número era " + numeroRandom);
        }
    }
}