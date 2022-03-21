public class VariablesReformadas {
    public static void main(String[] args) {

        int salario = 1000;

        //podemos asignar el valor a la misma variable
        salario = salario + 20;

        //incluso podemos agregar mas operaciones matematicas.
        salario = salario + (30*20) -500;

        System.out.println("El resultado es: "+salario);

        //podemos tambien poner una variable en cualquier lugar
        String nombre = "Ricardo Aceves";

        nombre = nombre + " Torres";

        System.out.println("El nombre es: "+nombre);

        //Inferencia de variables a partir de la version 10 de Java.
        var salarioTotal = 1685.70;

        salarioTotal = salarioTotal + salario;
        System.out.println("El salario es: "+salarioTotal);

    }
}
