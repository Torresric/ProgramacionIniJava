public class ForLoop {

    static boolean isTurnOnLight = false; //Es la asignacion de una variable global al scoope (nivel) del main.

    //Inicio del metodo main, que es el principal.
    public static void main(String[] args) {

        isTurnOnOffLight(); //Se llama la funcion.

        for (int i = 1; i <= 10; i++) { //puedo poner solamente "fo" y me aparece la opcion fori que rellena mi sentencia.

            PrintSOS(); //llamo al metodo para que imprima en pantalla

        } //fin del for

    }

    /**
     * Descripcion: Este es un procedimiento el cual cuando es invocado imprime el codigo SOS, no tiene una salida
     * de parametros ni tampoco los recibe.
     * */
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
    } //Fin de isTurnOnOffLight

} //Fin de la clase.
