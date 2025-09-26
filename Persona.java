package Unidad_2_Taller_9_UsoSuper;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println(nombre + " " + edad);
    }
}
