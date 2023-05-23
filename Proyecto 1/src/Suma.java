import java.util.Scanner; //LLama a la librería que permite los input

public class Suma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Método que permite

        int num1, num2, suma, resta, producto; // Variables declaradas y operaciones

        System.out.println("Escriba el primer entero: ");
        num1 = entrada.nextInt(); //Lee el primer valor por teclado

        System.out.println("Escriba el sergundo entrero: ");
        num2 = entrada.nextInt(); //Lee el segundo valor por teclado

        //Sección que define las operaciones aritméticas
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;

        System.out.printf("La suma es: %d\n", suma);
        System.out.printf("La resta es: %d\n", resta);
        System.out.printf("La producto es: %d\n", producto); //Printf permite agregar variables a la impresion
    }
}
