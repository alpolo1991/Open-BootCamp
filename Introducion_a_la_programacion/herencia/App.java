package Introducion_a_la_programacion.herencia;

/* --------------------------------
Crea una clase Persona con las siguientes variables:

La edad
El nombre
El teléfono

Una vez creada la clase, 
    crea una nueva clase Cliente que herede de Persona, 
    esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades 
    la edad, 
    el telefono, 
    el nombre y el credito, 
    tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, 
    haz lo mismo con la clase Trabajador que herede de Persona, 
    y con una variable salario que solo tenga la clase Trabajador.
*/

public class App {
    public static void main(String[] args) {
        // Instanciamos
        Cliente claseCliente = new Cliente();
        // Como estamos heradando las propiedades y metodos de la clase Persona
        // podemos invicarlos de la clase Cliente.
        claseCliente.setEdad(31);
        claseCliente.setNombre("Alfonso Gonzalez");
        claseCliente.setTelefono(57345789);
        claseCliente.setCredito(35900);
        // Mostramos por pantalla
        System.out.println("Clase Cliente \n");
        System.out.println("Mi nombres es: " + claseCliente.getNombre());
        System.out.println("Tengo " + claseCliente.getEdad() + " años");
        System.out.println("Mi telefono es: " + claseCliente.getTelefono());
        System.out.println("y tengo un credito por : " + claseCliente.getCredito() + " Euros");
        System.out.println("\n");
        // Instanciamos
        Trabajador claseTrabajador = new Trabajador();
        // Como estamos heradando las propiedades y metodos de la clase Persona
        // podemos invicarlos de la clase Cliente.
        claseTrabajador.setEdad(29);
        claseTrabajador.setNombre("Jose Alfonso Perez");
        claseTrabajador.setTelefono(57786543);
        claseTrabajador.setSalario(12000);
        // Mostramos por pantalla
        System.out.println("Clase Trabajador \n");
        System.out.println("Nombre del trabajador: " + claseTrabajador.getNombre());
        System.out.println("Tiene " + claseTrabajador.getEdad() + " años");
        System.out.println("El telefono del trabajador es: " + claseTrabajador.getTelefono());
        System.out.println("El salario que gana el trabajador es: " + claseTrabajador.getSalario());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
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

    public Persona(){
        edad = 0;
        nombre = "";
        telefono = 0;
    }
}

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Cliente(){
        credito = 0;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Trabajador(){
        salario = 0;
    }
}