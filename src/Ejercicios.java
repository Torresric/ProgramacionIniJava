public class Ejercicios {
    public static void main(String[] args) {

        //Presentacion de familiares
        String presentacion= "Esta persona es: ";
        String esposa = "Erendira Perez", hermano = "Carlos Alberto", hermana = "Fatima del Carmen";

        System.out.println(presentacion+esposa);
        System.out.println(presentacion+hermana);
        System.out.println(presentacion+hermano);

        //Casting ejercicio 2
        int c1 = (int)'z'; //no necesita cast porque es de menor a mayor.
        System.out.println("De char a int "+c1);

        int i= 250;
        long c2 = i; //no necesita cast porque es de menor a mayor
        System.out.println("De entero a long "+c2);
        short c3= (short) c2; //necesita cast porque es de menor a mayor. en C3 estoy guardando el dato long pero como short.
        System.out.println("De long a short "+c3);



    }
}
