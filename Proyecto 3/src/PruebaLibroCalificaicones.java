import java.sql.SQLOutput;
import java.util.Scanner;

public class PruebaLibroCalificaicones{
    public static void main(String args[]){
        //Scanner entrada = new Scanner(System.in);

        //Crea un objeto y lo asigno a milibroCalificaciones
        //LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("Curso POO 2023");

        LibroCalificaciones libro1 = new LibroCalificaciones("Curso GR1 - POO 2023-A");

        //System.out.println("\n Escriba el nombre del curso:"); //Pide y recibe nombre del curso como entrada
        //String nombreCurso = entrada.nextLine(); //Lee la entrada
        System.out.println();

        // llama al método mostrarMensaje de miLibroCalificaciones
        //y pasa nombreCurso como argumento
        //miLibroCalificaciones.mostrarMensaje(nombreCurso);

        //miLibroCalificaciones.obtenerNombre(); // muestra el valor inicial de nombreDelCurso para cada LibroCalificaciones

        System.out.printf("El nombre del curso 1 es: %s\n", libro1.obtenerNombre());
    }
}
