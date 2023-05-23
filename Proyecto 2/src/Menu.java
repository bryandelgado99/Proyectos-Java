public class Menu {
    public static void main(String[] args) {
        //Creamos instancias para cada objeto
        Transporte bus = new Transporte();
        Transporte motocicleta = new Transporte();
        Transporte bicicleta = new Transporte();
        Transporte jet = new Transporte();
        Transporte velero = new Transporte();

        Transporte yate = new Transporte();

        //Llamamos los métodos de cada instancia
        bus.Acelerar();
        System.out.println('\n');
        /*jet.Volar();
        motocicleta.Caminar();
        bicicleta.Navegar();
        velero.Sumergir();*/

        yate.Navegar();
        yate.Naufraga();

        /*Llamamos a los atributos
        int capacity = bus.Capacidad.nextInt();
        System.out.println(capacity);*/

    }
}
