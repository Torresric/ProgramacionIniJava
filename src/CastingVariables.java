public class CastingVariables {
    public static void main(String[] args) {

        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);


        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double d = a / b;
        System.out.println(d); // 2.0 (??)

        double e = (double) a / b;
        System.out.println(e); // 2.5

    }
}
