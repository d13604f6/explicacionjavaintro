//esta es la clase
public class matriz {
    //este es el metodo main
    public static void main(String[] args) {

        String[][] matrix = new String[3][3];

        //puedo asignar valores de esta forma
        matrix[0][0] = "A";

        //asigno valores mediante el For
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matrix[i][j] = "A";

            }
        }

        //Muestro la matriz
        for (int i = 0; i < 3; i++){
           for (int j = 0; j < 3; j++) {

               System.out.println("[" + matrix[i][j] + "]");
           }
           System.out.println("");
        }
    }
}
