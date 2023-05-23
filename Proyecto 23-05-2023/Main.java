import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    //Instancia
        Genero genre1 = new Genero("rock", "125 bpm", "Estados Unidos", "Jimmy Jendrix",
                "Woodstock", 1958);
        Genero genre2 = new Genero("pasillo", "100 bpm", "Ecuador", "Julio Jaramillo",
                "Ninguno", 1960);
        Genero genre3 = new Genero("metal", "200 bpm", "Inglaterra", "Ozzy Osbourne",
                "Woodstock", 1980);
        Genero genre4 = new Genero("marimba", "180 bpm", "Africa", "Desconocido",
                "Ninguno", 1800);
        Genero genre5 = new Genero("blues", "115 bpm", "Estados Unidos", "B.B. King",
                "Lolapaloosa", 1940);
        Genero genre6 = new Genero("nu metal", "220 bpm", "Estados Unidos", "Korn",
                "Rock em Ring", 1998);

        /*//Sumamos los años
        int total_anio = genre1.getYear()+genre2.getYear()+genre3.getYear()+genre4.getYear()+genre5.getYear()+genre6.getYear();
        //Imprimimos los valores de los géneros
        System.out.println(genre1.getRitmo());

        System.out.println("El total de años es: " + total_anio);

        //Modificar parametros
        genre2.setFestival("Festival Nacional del Pasillo");
        System.out.println(genre2.getFestival());*/

        //Creamos un menu
        System.out.println("\n------------- Bievenido al Sistema de Registro de Géneros! ------------");
        Scanner entrada = new Scanner(System.in);

        System.out.print("-----> Usuario, ingrese el año de creación del género rock: ");
        int anio = entrada.nextInt();

        genre1.setYear(anio);

        System.out.println("El año del género rock es: " + genre1.getYear());

        genre1.imprimirDatos();
    }
}
