//esta es la clase

import java.util.Scanner;

public class dowhile {

    //este es el metodo Main
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String respuesta;

        do {

            System.out.println("Desea Continuar?");
            respuesta = leer.nextLine();


        }
        while (respuesta.equalsIgnoreCase("S")) ;

    }
}
