package Introducion_a_la_programacion.;
/*
*Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
*/

public class app {
    public static void main(String[] args) {
        //Instanciamos la Clase persona
        Persona persona = new Persona();
        
        //Asignamos valores a las propiedades con el metodo Setter
        persona.setNombre("Alfonso");
        persona.setApellidos("Gonzalez");
        persona.setEdad(31);
        persona.setTelefono(572314560);
        //Mostramos los datos que tienen las pripiedades con los metodo Getter
        System.out.println("El nombre es: " + persona.getNombre() + " " + persona.getApellidos());
        System.out.println("La edad ingresa es: " + persona.getEdad());
        System.out.println("El telefono ingresado es: " + persona.getTelefono());

    }
}

class Persona {
    // Creamos las propiedades
    private int edad;
    private String nombre;
    private String apellidos;
    private int telefono;

    // Creamos los metodos Getter y Setter
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
