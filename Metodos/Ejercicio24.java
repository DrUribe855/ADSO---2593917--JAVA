import java.util.Scanner;

public class Ejercicio24{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo ");
        int arrayLength = datosEntrada.nextInt();

        String arrayStrings [] = new String[arrayLength];

        for(int i = 0; i < arrayLength; i++){
            System.out.println("Ingrese un texto ");
            arrayStrings[i] = datosEntrada.next();
        }
        System.out.print("Ingrese la posicion del dato que desea eliminar ");
        int delete = datosEntrada.nextInt();
        for(int y = delete; y < arrayLength-1; y++){
            arrayStrings[y] = arrayStrings[y+1];
        }
        // arrayStrings[arrayLength-1] = auxiliar;

        for(int x = 0; x < arrayLength-1; x++){
            System.out.print("[ "+arrayStrings[x]+" ]");
        }
    }
}