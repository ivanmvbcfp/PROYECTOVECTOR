
package MAIN;


public class Main5 {


    public static void main(String[] args) {
        int[] edad = {15,45,34}; //Vector
        //Matriz (array bidimensional)
        String[][] nombre = {{"Luis","Miguel"},
        {"Carlos,Juan"},
        {"Arturo","Lucho"}};//3x2= fila columna
        //recorrer la matriz
        for (int i = 0; i < nombre[0].length; i++) { //filas
            for (int j = 0; j < nombre[0].length; j++) { //columnas
                System.out.print(nombre[i][j] + "\t");
            }
            System.out.println();
}
    }
        }