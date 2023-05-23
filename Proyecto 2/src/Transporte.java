import java.util.Scanner;
public class Transporte {
        //Atributos
        String tipo;
        double Velocidad;
        int Aceleracion;
        String Motor;
        double Peso;
        Scanner Capacidad = new Scanner(System.in);

        //Nuevos metodos

        int vel_max = 250;
        int acel_max = 25;
        float volumen = 5236;
        boolean vuela = false;
        int agua = 50000;


        //Metodos
        public void Caminar(){
            System.out.println("Método que define avance: ");
        }
        public void Volar(){
            System.out.println("Método que define vuelo: ");
        }
        public void Navegar(){
            System.out.println("Método que define navegación marítima: ");
        }
        public void Acelerar(){
            System.out.println("Método que define aceleración: ");
        }
        public void Sumergir() {
            System.out.println("Método que define si se sumerge: ");
        }

        //Nuevos métodos
        public void Velas(){System.out.println("Velas levantadas!");}
        public void Naufraga(){System.out.println("Puede naufragar por fallas! Precaución");}
        public void Combustible(){System.out.println("Usa combustible diesel");}
        public void Camarota(){System.out.println("No posee Camarotes");}
        public void Piscina(){System.out.println("Posee una piscina mediana");}
}
