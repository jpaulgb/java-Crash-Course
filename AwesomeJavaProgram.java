import java.util.logging.MemoryHandler;

public class AwesomeJavaProgram {

    public static void main(String[] args) {
        String name = printName("Larry", 2);
    }

private static String printName(String name, int number) {
    
    //conditional
    if (name.equals("John")) {
        System.out.println("This guy is awesome");
    }
    else if (name.equals("Larry")) {
        System.out.println("This guy is Ok");
    }
    else {

    }
    
    return("My name is " + name);
}

}

