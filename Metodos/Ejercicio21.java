import java.util.Scanner;

public class Ejercicio21{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del vector 1");
        int firstVectorLength = datosEntrada.nextInt();

        System.out.print("Ingrese el tamano del vector 2");
        int secondVectorLength = datosEntrada.nextInt();

        int firstVector [] = new int[firstVectorLength];
        int secondVector [] = new int[secondVectorLength];

        for(int i = 0; i < firstVectorLength; i++){
            System.out.print("Ingrese los numeros del primer vector ");
            firstVector[i] = datosEntrada.nextInt();
        }
        for(int j = 0; j < secondVectorLength; j++){
            System.out.print("Ingrese los numeros del segundo vector ");
            secondVector[j] = datosEntrada.nextInt();
        }

        int totalLength = firstVectorLength + secondVectorLength;

        if(firstVectorLength > secondVectorLength){
            System.out.print("{ ");
            for(int y = 0; y < firstVectorLength; y++){
                System.out.print(firstVector[y]+", ");
                System.out.print(secondVector[y]+", ");
            }
            System.out.print(" }");

        }else if(firstVectorLength == secondVectorLength){
            System.out.print("{ ");
            for(int y = 0; y < firstVectorLength; y++){
                System.out.print(firstVector[y]+", ");
                System.out.print(secondVector[y]+", ");
            }
            System.out.print(" }");
        }else if(firstVectorLength < secondVectorLength){
            System.out.print("{ ");
            for(int y = 0; y < secondVectorLength; y++){
                System.out.print(firstVector[y]+", ");
                System.out.print(secondVector[y]+", ");
            }
        }
    }
}