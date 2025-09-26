package Unidad_2_Taller_9_UsoSuper;

public class Empleado extends Persona {
    String departamento;

    public Empleado(String nombre, int edad, String departamento){
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println(departamento);
    }
}
