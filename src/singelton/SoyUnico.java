package singelton;

// En esta clase encontramos la caracteristica de Encapsulación, porque hay ocultación de atributos y restringe el acceso directto al String nombre

public class SoyUnico {
    private String nombre;
    private static SoyUnico soyUnico;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private SoyUnico(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }
    public static SoyUnico getSingletonInstance(String nombre) {
        if (soyUnico == null){
            soyUnico = new SoyUnico(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase singelton.SoyUnico");
        }
        return soyUnico;
    }
    public String getNombre(){
        return this.nombre;
    }
}

// Equipo: Jesus Alejandro Hernandez Mendez, Eduardo Noriega Rodriguez, Luis Holgado Arranz