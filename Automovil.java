//class Automovil {//clase publica por default
  public class Automovil{
    String marca;  //Propiedad de tipo OBJETO string
    String modelo;
    String color;
    double cilindraje; //Tipo de dato NATIVO, el mismo que en c
    Integer numPuertas;
    int numPuerta;
    //TODO NUMERICO USAR NATIVO
    //Declaracion de Constructores y Destructores

  public Automovil() {
  }

  public Automovil(String marca) {
    this.marca = marca;
  }
//DESARROLLOS DE METODOS PROPIOS

    public void detalle(){
      System.out.println("Datos del objeto auto1 - Clase Vehículo");
      System.out.println("Marca: "+ this.marca);
      System.out.println("Modelo: "+ this.modelo);
      System.out.println("Color: "+ this.color);
      System.out.println("Cilindraje: "+ this.cilindraje);
      System.out.println();
    }

}

