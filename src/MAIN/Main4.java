
package MAIN;


public class Main4 {


    public static void main(String[] args) {
        //ARRAY DINAMICO
        
        int[] edad;
        //ingrese el tamaño del arry
        System.out.print("Tamaño array: ");
        int longitud = Entrada.readInt();
        edad = new int[longitud];
        //ingresar los datos por teclado
        for (int i=0; i<longitud; i++) {
            System.out.println("Elemento " + (i+i) + "? 22");
            edad[i] = Entrada.readInt();
        }
        
        //mostrar los datos ingresados
        for (int i=0; i<longitud; i++) {
            System.out.println("Elemento " + (i+i) +": "+ edad[i]);
        }
    }
    
}
