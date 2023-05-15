/*
*  Implementar un programa en java que permita ingresar al usuario 5 calificaciones y sacar su promedio. */

import java.util.Scanner;

public class Promedios {
    public static void main(String[] args){
        //Para definir este ejercicio, emplearemos un bucle, que permita iterar 5 veces el ingreso de notas (floats) y,
        // al finalizar, nos de el promedio como un float.
        //Declaramos las variables
        Scanner entrada = new Scanner(System.in);
        double nota, promedio;
        double suma = 0;

        //Definimos el programa
        System.out.println("Sistema para Validacion de Promedios\n");

        for(int i=1; i<=5; i++){
            System.out.printf("Por favor, ingresar la nota nro. " + i +": ");
            nota = entrada.nextDouble();

            if(nota>=0 && nota<=20){
                System.out.println("Ingreso correcto!\n");
            }
            else{
                System.out.println("Nota fuera de rango!\n");
                break;
            }
            suma = suma+nota;
        }
        //Definimos el promedio
        promedio = suma/5;
        System.out.println("\nEl promedio del estudiante es: " + promedio);
    }
}
