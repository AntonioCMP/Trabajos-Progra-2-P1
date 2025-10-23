public class Main {
    public static void main(String[] args) {
        //instanciacion, creacion de objetos
        //Constructor crea. Destructor destruye, xd

        //Declaraciones
        Automovil auto1 = new Automovil(); //Creo un nuevo objeto de class autmovil//Creo un constructor que crea un espacio de memoria a un objeto
        Automovil auto2 = new Automovil();
        Bicicleta bici1 = new Bicicleta();

        //Asignación de datos a los atributos
        auto1.marca="Aston Martin";
        auto1.modelo="Vantage";
        auto1.color="Verde";
        auto1.cilindraje=4.0;

        auto2.marca="Ferrari";
        auto2.modelo="488 Italia";
        auto2.color="Rojo";
        auto2.cilindraje=6.0;

        //Asignacion de datos a la nueva clase y nuevo objeto
        bici1.color="Negra";
        bici1.marcaSuspension="Suntour";
        bici1.marca="GW";
        bici1.modelo="Ocelot";
        bici1.numSuspenciones=2;

        //Salidas
        auto1.detalle();
        auto2.detalle();

 /*       System.out.println("Datos del objeto auto2 - Clase Vehículo");
        System.out.println("Marca: "+ auto2.marca);
        System.out.println("Modelo: "+ auto2.modelo);
        System.out.println("Color: "+ auto2.color);
        System.out.println("Cilindraje: "+ auto2.cilindraje);
*/


    }
}