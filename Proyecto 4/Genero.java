public class Genero {
    //Atributos
    String tipo, ritmo, pais_origen, artista, festival;
    int year;

    //Constructores ayudan a inicializar los valores de los atributos de una clase
    public Genero(String tipo, String ritmo, String pais_origen,
                  String artista, String festival, int year) {
        this.tipo = tipo;
        this.ritmo = ritmo;
        this.pais_origen = pais_origen;
        this.artista = artista;
        this.festival = festival;
        this.year = year;
    }

    //Métodos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRitmo() {
        return ritmo;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Método para imprimis datos generales
    public void imprimirDatos(){
        System.out.println("\nEl género es: " + this.tipo);
        System.out.println("El año es: "+ this.year);
        System.out.println("El festival es:"+this.festival);
        System.out.println("Su rimo es:"+this.ritmo);
        System.out.println("Su pais de origen fue: "+this.pais_origen);
        System.out.println("Su artista representativo es: "+this.artista);
    }
}

