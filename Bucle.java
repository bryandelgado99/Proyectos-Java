/*Utilizando un bucle, imprimir los numeros del 1 a n, donde n es un numero cualquiera que sirve como limite*/

import java.util.Scanner;
public class Bucle {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int limite;

        System.out.println("Escribe el numero limitante: ");
        limite = entrada.nextInt();

        System.out.println("El valor de la series es: \n");
        for(int i=1; i<=limite; i=i+1){
            System.out.println(i);
        }
    }
}