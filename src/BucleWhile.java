public class BucleWhile {

    static boolean isTurnOnLight = false; //Es la asignacion de una variable global al scoope (nivel) del main.

    public static void main(String[] args) {

        isTurnOnOffLight(); //Se llama la funcion.

        int i = 1;
        while (isTurnOnLight && i<=10){
            PrintSOS();
            i++;
        }

    }

    public static void PrintSOS(){
        System.out.println("...---...");
    } //Fin de la procedimiento.

    /**
     * Descripcion: Este dejo vacio el parametro, pero lo podemos agregar si quisieramos, regresa true o false
     * segun tenga el valor booleano, usando el operador ternario, el cual es variable = (procedimiento)? opcion1 : opcion2;
     * si se cumple el procedimiento arroja la primera opcion, sino arroja la segunda.
     * */
    public static boolean isTurnOnOffLight (){
        isTurnOnLight = (isTurnOnLight)? false:true;
        return isTurnOnLight;
    }

} //Fin de la clase
