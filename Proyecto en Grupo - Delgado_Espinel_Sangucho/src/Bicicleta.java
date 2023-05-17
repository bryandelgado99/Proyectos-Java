public class Bicicleta {
    String tipo;
    int marchas;

    //Set o setters
    public void establacerTipo(String tiposDisponibles){
        tipo = tiposDisponibles;
    }
    public void establecerMarchas(int lasMarchas){
        marchas = lasMarchas;
    }

    //Get o getters
    public String obtenerTipo(){
        return tipo;
    }
    public int obtenerMarchas(){
        return marchas;
    }

    //Output
    public void imprimirTipo(){
        System.out.println("Tipo de Bicicleta: " + tipo);
    }
    public void imprimirMarchas(){
        System.out.println("Numero de marchas: " + marchas);
    }
}
