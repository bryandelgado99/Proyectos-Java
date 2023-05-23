/**
 * Utilizando un bucle imprimir los números del 1 al n, donde N es un numero que ingrese el usuario
 * */
import java.util.Scanner;
public class Bucle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limite;

        System.out.println("Escriba el numero que sera el limite de la operacion: ");
        limite = entrada.nextInt();

        System.out.println("El valor de la serie es: \n");
        for(int i=1; i<=limite; i=i+1) {
            System.out.println(i);
        }

    }
}

