import java.util.Scanner;

//esta es la clase
public class lecturayentrada {

    //este es el metodo Main
    public static void main (String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Con esta clase guardamos valores ingresados por consola en las variables ");
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();

    }


}
