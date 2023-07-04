import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner argos = new Scanner(System.in);

        /*try{
            int [] myNUmbers = {1,2,3};
            System.out.println(myNUmbers[10]);
        }
        catch (Exception e){
            System.out.println("Algo ha ido mal");
            System.out.println(e);
        }
        finally {
            System.out.println("Mana Mana tu tu tu ru ru");
        }*/

        System.out.println("----Ejercicios con Manejo de Excepciones----");

        System.out.println("\n1. Division entre Cero (Sin Excepciones)");
        System.out.println("\n2. Division entre Cero (Con Excepciones try y catch)");
        System.out.println("\n3. Division entre Cero (Sin Excepciones trhy, catch y finally)");

        System.out.println("Por favor seleccines el valor ejercicio a visualizar: ");
        int arq = argos.nextInt();

        switch (arq) {
            case 1 -> {
                System.out.println("\n---------------------Ejercicio 13.1------------------------\n");
                System.out.println("\t------> Divvision entre Cero Sin Excepciones \n");
                Scanner explorador = new Scanner(System.in);
                System.out.println("Introduzca un numerador entero: ");
                int numerador = explorador.nextInt();
                System.out.println("Introduzca un denominador entero: ");
                int denominador = explorador.nextInt();
                int resultado = ejercicio_13_1.cociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
                System.out.println("\n-----------------------------------------------------------\n");
            }
            case 2 -> {
                System.out.println("\n---------------------Ejercicio 13.2------------------------\n");
                System.out.println("\t------> Divvision entre Cero Sin Excepciones \n");
                Scanner puntero = new Scanner(System.in);
                boolean continuarCiclo = true;
                do {
                    try {
                        System.out.println("\nIntroduzca un numerador entero: ");
                        int numerador1 = puntero.nextInt();

                        System.out.println("Introduzca un denominador entero: ");
                        int denominador1 = puntero.nextInt();

                        int resultado1 = ejercicio_13_2.cociente(numerador1, denominador1);
                        System.out.printf("\nResultado: %d / %d = %d\n", numerador1, denominador1, resultado1);
                        continuarCiclo = false;
                    } catch (InputMismatchException inputMismatchException) {
                        System.err.println();
                        puntero.nextLine();
                        System.out.println("Debe introducir enteros válidos. Intente nuevamente!\n\n");
                    } catch (ArithmeticException x) {
                        System.err.println();
                        System.out.println("\n\t--> No se puede dovidir entre 0, intente nuevamente!\n\n");
                    }
                } while (continuarCiclo);
            }
            case 3 -> {
                System.out.println("\n---------------------Ejercicio 13.5------------------------\n");
                try {
                    ejercicio_13_5.lanzarExcepcion();
                } catch (Exception exception) {
                    System.out.println("La excepcion se maneja en el main");
                }
                ejercicio_13_5.noLanzaExcepcion();
                System.out.println("\n-----------------------------------------------------------\n");
            }
            default -> System.out.println("Esta opcion no esta disponible");
        }

    }
}