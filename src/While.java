

import java.util.Scanner;
//esta es la clase
public class While {

    //este es el metodo Main
    public static void main (String[] args) {

        Scanner leer = new Scanner(System.in);

        String respuesta = "S";

        while (respuesta.equalsIgnoreCase("S")) {

            System.out.println("Desea continuar?:");

            respuesta = leer.nextLine();

        }

    }
}
