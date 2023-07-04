public class ejercicio_13_5 {

    public static void lanzarExcepcion() throws  Exception{
        try{
            System.out.println("Metodo lanzaExcepcion");
            throw new Exception();
        }
        catch (Exception exception){
            System.err.println("La excepcion se manejo en el metodo LanzaExcepcion");
            throw exception;
        }
        finally{
            System.err.println("Se ejecuta finally en el lanzaExcepcion");
        }
    }

    public static  void noLanzaExcepcion(){
        try {
            System.out.println("Metodo noLanzaExcepcion");
        }
        catch (Exception exception){
            System.err.println(exception);
        }
        finally {
            System.err.println("Se ejecuta finally en noLanzaExcepcion");
        }
        System.out.println("Fin del Método noLanzarExcepcion");
    }
}

