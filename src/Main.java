import singelton.SoyUnico;

// Podemos encontrar el principio de Abstracción en la clase, porque oculta los detalles de la implementación del código

public class Main {
    public static void main(String[] args) {
        SoyUnico ricardo = SoyUnico.getSingletonInstance("Ricardo Moya");
        SoyUnico ramon = SoyUnico.getSingletonInstance("Ramón Invarato");
        System.out.println(ramon.getNombre());
        System.out.println(ricardo.getNombre());
    }
}

// Equipo: Jesus Alejandro Hernandez Mendez, Eduardo Noriega Rodriguez, Luis Holgado Arranz