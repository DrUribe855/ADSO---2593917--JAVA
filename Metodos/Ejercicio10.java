import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[]args){
         
        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Escriba el tamaño que tendra el arreglo");
        int arrayLength = datosEntrada.nextInt();

        int numbersArray [] = new int[arrayLength];

        for(int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = (((i+1)*2)-1);
        }
        for(int j = 0; j < numbersArray.length; j++){
            System.out.println("Numero: "+numbersArray[j]);
        }
    }
}