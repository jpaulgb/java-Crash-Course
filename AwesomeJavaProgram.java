import java.util.logging.MemoryHandler;

public class AwesomeJavaProgram {

    public static void main(String[] args) {
        //Datos Primitivos:

        //Entero
        int myInt = 7;
        
        //Números de punto flotante:
        double shoeSize = 5;

        //Carácter
        char myInitial = 'J';

        //Datos No Primitivos
        //Secuencias de caracteres
        String myName = "Jhon";

        double result = myInt * shoeSize;   
        
        //Resultados en pantalla
        System.out.println(myInt * shoeSize);
        System.out.println(result);
        System.out.println(myName);
        System.out.println(myName.length());
        //Mayusculas
        System.out.println(myName.toUpperCase());
        
        //Llamando a burp()
        burp();
    }

private static void burp() {
    System.out.println("Buurrp");
}

}

