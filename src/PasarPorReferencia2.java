class Persona {
    private String nombre;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

}


public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Diego");

        System.out.println("Iniciamos el método main");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Antes de llamar el método test");
        test(persona);
        System.out.println("Después de llamar el método test");
        System.out.println("persona.getNombre() = " + persona.getNombre());

        System.out.println("Finaliza le método main con los datos de la persona modificado");

    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");
        persona.setNombre("Pepe");
        System.out.println("finaliza el método test");
    }

}
