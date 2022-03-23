public class FuncionesJava {
    public static void main(String[] args) {

        double y = 2.3;
        String moneda = "MXN";

        //Area de un circulo
        //pi * r2
        System.out.println(circleArea(y));

        //Area de una esfera
        //4*PI*r2
        System.out.println(sphereArea(y));

        //Volumen de una esfera
        //(4/3)*pi * r3
        System.out.println(sphereVolum(y));

        //Da el convertidor a Dll ingresando el peso y tipo de moneda.
        System.out.println(convertToDollar(y,moneda));

    } //Fin del metodo main

    //Las funciones se declaran a nivel e main en el mismo scoope.
    //Saca el area del circulo recibiendo solo el radio.
    public static double circleArea (double r){
        return  Math.PI * Math.pow(r,2);
    } //fin de la funcion.

    //Saca el area de una esfera
    public static double sphereArea (double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    //Saca el volumen de una esfera, recibiendo un valor.
    public static double sphereVolum (double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    //Cambia de valor monetario
    public static double convertToDollar (double m, String t){
        switch (t){
            case "MXN":
                m=m*20;
                break;

            case "POV":
                m=m*50;
                break;
        } //Fin del case
        return m;
    } //Fin del convertidor


} //Fin de la clase
