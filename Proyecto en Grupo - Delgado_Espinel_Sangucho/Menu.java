import java.util.Scanner;

public class Menu {
   public static void main(String args[]){

       //Definimos las intancias
       Bicicleta type1 = new Bicicleta();
       Bicicleta type2 = new Bicicleta();
       Bicicleta type3 = new Bicicleta();

       //Establecer tipo
       type1.establacerTipo("montana");
       type2.establacerTipo("electrica");
       type3.establacerTipo("deportiva");

       //Establecemos marchas
       type1.establecerMarchas(8);
       type2.establecerMarchas(4);
       type3.establecerMarchas(6);

       //Programa general
       System.out.println("\n-----Bienvenido a BiciClear!-----\n");

       type1.imprimirTipo();
       type1.imprimirMarchas();
       System.out.println("El valor es de $950\n");

       type2.imprimirTipo();
       type2.imprimirMarchas();
       System.out.println("El valor es de $550\n");

       type3.imprimirTipo();
       type3.imprimirMarchas();
       System.out.println("El valor es de $990");
   }
}
