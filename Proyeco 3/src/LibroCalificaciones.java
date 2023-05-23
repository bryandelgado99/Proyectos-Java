// Declaración de una clase con un método que tiene un parámetro.
public class LibroCalificaciones{
    // muestra un mensaje de bienvenida al usuario de LibroCalificaciones

    private String nombreCurso;

    public LibroCalificaciones(String name){
        nombreCurso = name;
    }

    public void establecerNombre(String name){
        nombreCurso = name;
    }
    public String obtenerNombre(){
        return nombreCurso;
    }

    public void mostrarMensaje(){
        System.out.printf("¡Bienvenido al libro de calificaciones para\n%s!\n", obtenerNombre());
    }

   /* public void mostrarMenasje(String nombreCurso){
        System.out.println("¡Bienvenido al libro de calificaciones para " + nombreCurso +"!");
    }*/
}
