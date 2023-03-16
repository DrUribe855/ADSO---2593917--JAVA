import java.util.Scanner;

public class Ejercicio20{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Indique el tamano de los vectores: ");
        int arraysLength = datosEntrada.nextInt();

        int firstArray [] = new int[arraysLength];
        int secondArray [] = new int [arraysLength];
        int equivalencias = 0;

        for(int i = 0; i < firstArray.length; i++){
            System.out.print("Ingrese un numero para el arreglo 1  ");
            firstArray[i] = datosEntrada.nextInt();
            System.out.print("Ingrese un numero para el arreglo 2  ");
            secondArray[i] = datosEntrada.nextInt();
        }
        for(int j = 0; j < firstArray.length; j++){
            for(int y = 0; y < secondArray.length; y++){
                if(firstArray[j] == secondArray[y]){
                    equivalencias++;
                }
            }
        }
        if(equivalencias == arraysLength){
            for(int i = 0; i < firstArray.length; i++){
                System.out.print(firstArray[i]);
            }
            System.out.println(" ");
            for(int m = 0; m < secondArray.length; m++){
                System.out.print(secondArray[m]);
            }
            System.out.println(" ");
            System.out.print("Los vectores son equivalentes");
        }
    }
}