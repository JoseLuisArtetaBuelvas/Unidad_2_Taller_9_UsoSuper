package Unidad_2_Taller_9_UsoSuper;

public class Animal {
    String especie;
    private String adn;

    public Animal(String especie){
        this.especie = especie;
    }

    public void mostrarDetalles(){
         System.out.println(especie);
    }
}
