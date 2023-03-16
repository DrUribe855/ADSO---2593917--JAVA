import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo: ");
        int arrayLength = datosEntrada.nextInt();

        int arrayNumbers [] = new int[arrayLength];
        for(int i = 0; i < arrayNumbers.length; i++){
            int m = 1;
            while(m <= arrayLength){
                int contador = 0;
                int j = 1;
                int random = (int)(Math.random()*99);
                while(j <= random){
                    if(random%j == 0){
                        contador++;
                    }
                    j++;
                }
                if(contador == 2){
                    m++;
                    arrayNumbers[i] = random;
                }
            }
        }
        for(int k = 0; k < arrayNumbers.length; k++){
            System.out.println("Numero: " + arrayNumbers[k]); 
        }
    }
}