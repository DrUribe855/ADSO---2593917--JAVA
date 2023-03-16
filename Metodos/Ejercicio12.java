import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector");
        int arrayLength = datosEntrada.nextInt();

        int arrayNumbers [] = new int[arrayLength];

        for(int i = 0; i < arrayNumbers.length; i++){
            arrayNumbers[i] = (int)(Math.random()*99);
        }

        int auxiliar = 0;

        for(int j = 0; j < arrayNumbers.length-1; j++){
            for(int y = 0; y < arrayNumbers.length-1; y++){
                if(arrayNumbers[y] < arrayNumbers[y+1]){
                    auxiliar = arrayNumbers[y];
                    arrayNumbers[y] = arrayNumbers[y+1];
                    arrayNumbers[y+1] = auxiliar;
                }
            }
        }

        for(int m = 0; m < arrayNumbers.length; m++){
            System.out.println(arrayNumbers[m]);
        }
    }
}