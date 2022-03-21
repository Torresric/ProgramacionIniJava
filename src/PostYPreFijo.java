public class PostYPreFijo {

    public static void main(String[] args) {

        int salario=10, bono=30;

        //con el prefijo podemos ver la suma de uno, mientras que con el postfijo al sumarlo con otro no.

        salario = salario++;
        System.out.println(salario);

        salario = ++salario;
        System.out.println(salario);

        salario = bono + salario;
        System.out.println(salario);

        salario = bono + ++salario;
        System.out.println(salario);


    }
}
