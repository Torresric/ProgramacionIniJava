public class SentenciaIf {
    public static void main(String[] args) {

        boolean isBluetoothEnable = false;
        int sendFile= 3;

        if (isBluetoothEnable){
            //Si el bluetooth esta encendido entra
            sendFile++; //anade uno por cada que envia un archivo
            System.out.println("Archivo enviado, Bluetooth encendido");
            int e =5; //solo esta declarada para el If, asi que no funciona en el else.
        } else {
            System.out.println("Enciende tu Bluetooth por favor.");
            int i= 3; //las variables declaradas dentro de estos nodos como else, son solo locales y no globales.
            i--;
            System.out.println(i);
        } //Fin del else
    }
}
