//esta es la clase
public class vector {
    //este es el metodo main
    public static void main(String[] args) {

        int[] vector = new int[7];

        //puedo asignar valores de esta manera
        vector[0] = 3;

        //asigno valores mediante el for
        for (int i = 0; i < 7; i++) {

            vector [i] = i + 4;
        }
        //muestro el vector
        for (int i = 0; i < 7; i++ ) {

            System.out.println("[" +vector[i] + "]");
        }
        System.out.println(" ");
    }

}
