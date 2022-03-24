import java.util.Scanner; //Se importa esta libreria para poder utilizar Scanner

public class DoWhileStatements {
    public static void main(String[] args) {

        /* Este programa funciona solamente introduciendo numeros, sino, se cae el programa, no
        * admite errores en el ingreso de datos.*/

        int response = 0;
        Scanner sc = new Scanner(System.in);

        //Se va a repetir hasta que la opcion sea igual a 0.
        do {
            System.out.println("0. Para salir.");
            System.out.println("1. Para ver peliculas.");
            System.out.println("2. Para ver series.");
            System.out.println("3. Para ver telenovelas.");

            System.out.print("ingresa la opcion deseada: ");
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Gracias por utilizar el programa.\n");
                    break;
                case 1:
                    System.out.println("\nPeliculas mostrada en orden alfabetico.\n");
                    break;
                case 2:
                    System.out.println("\nSeries en consecutivo.\n");
                    break;
                case 3:
                    System.out.println("\nCon que te laten las novelas, baia baia.\n");
                    break;
                default:
                    System.out.println("\nPor favor ingresa una opcion valida.\n");
            } //Fin del case


        } while (response != 0); //Fin del while

        System.out.println("Fue un placer atenderlo.");
    }// Fin del metodo main
} //Fin de la class
