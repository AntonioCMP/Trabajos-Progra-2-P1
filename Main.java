public class Main {
    public static void main(String[] args){
        //Declaraciones
            Motocicletas moto1=new Motocicletas();
            Motocicletas moto2=new Motocicletas();
            Motocicletas moto3=new Motocicletas();
            Motocicletas moto4=new Motocicletas();
            Motocicletas moto5=new Motocicletas();
        //Asignacion de Atributos
            moto1.marca="Honda";
            moto1.modelo="Cbr300r";
            moto1.cilindraje=299.5;
            moto1.color="Rojo";

            moto2.marca="KTM";
            moto2.modelo="Duke 300";
            moto2.cilindraje=299.5;
            moto2.color="Naranja";

            moto3.marca="Royal Einfield";
            moto3.modelo="Himalayan";
            moto3.cilindraje=299.5;
            moto3.color="Gris";

            moto4.marca="Cf Moto";
            moto4.modelo="300 sR";
            moto4.cilindraje=299.5;
            moto4.color="Blanca";
            //Salidas

            moto1.detalle();
            moto2.detalle();
            moto3.detalle();
            moto4.detalle();
            moto5.detalle();

        /*
            do {
            System.out.println("\n--- AppStore de Juegos ---");
            System.out.println("1. Visualizar juegos");
            System.out.println("2. Comprar licencias");
            System.out.println("3. Vender licencias");
            System.out.println("4. Consultar juego más vendido");
            System.out.println("5. Consultar descuentos");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            /*
            switch (opcion) {
                case 1:
                    visualizarJuegos();
                    break;
                case 2:
                    comprarLicencias();
                    break;
                case 3:
                    venderLicencias();
                    break;
                case 4:
                    [span_6](start_span)
                    System.out.println("Juego más vendido: " + darJuegoMasVendido());
                    break;
                case 5:
                    [span_7](start_span)
                    consultarDescuentos();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }
            /*


     moto1.marca="Honda";
            moto1.modelo="Cbr300r";
            moto1.cilindraje=299.5;
            moto1.color="Rojo";

            moto2.marca="KTM";
            moto2.modelo="Duke 300";
            moto2.cilindraje=299.5;
            moto2.color="Naranja";

            moto3.marca="Royal Einfield";
            moto3.modelo="Himalayan";
            moto3.cilindraje=299.5;
            moto3.color="Gris";

            moto4.marca="Cf Moto";
            moto4.modelo="300 sR";
            moto4.cilindraje=299.5;
            moto4.color="Blanca";
            //Salidas

            moto1.detalle();
            moto2.detalle();
            moto3.detalle();
            moto4.detalle();
            moto5.detalle();
    }


}
