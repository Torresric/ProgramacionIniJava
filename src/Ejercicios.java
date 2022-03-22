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
        System.out.println("De char a int "+c1+" era "+'z');

        int i= 250;
        long c2 = i; //no necesita cast porque es de menor a mayor
        System.out.println("De entero a long "+c2+" era "+i);
        short c3= (short) c2; //necesita cast porque es de menor a mayor. en C3 estoy guardando el dato long pero como short.
        System.out.println("De long a short "+c3+" era "+c2);
        double d = 301.067;
        long c4 = (long) d;
        System.out.println("De double a long "+c4+" era "+d);
        int i2 = 100;
        float d8 = i2;
        float c5 = (float) (d8+5000.66); //para pasar de int a float creo que se debe encerrar en parentesis y forzarlo.
        System.out.println("De int a float "+c5+" era "+i2+" mas "+d8);
        int i3 = 737 * 100;
        byte c6 = (byte) i3;
        System.out.println("De int a byte "+c6+" era "+i3);
        double i4 = 298.638/25;
        long c7 = (long) i4;
        System.out.println("De double a long "+c7+" era "+i4);



    }
}
