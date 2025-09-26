package Unidad_2_Taller_9_UsoSuper;

public class Pez extends Animal{
    String tipoAgua;

    public Pez(String especie, String tipoAgua){
        super(especie); //Usar atributo privado adn y explicar los errores
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println(tipoAgua);
    }
}
