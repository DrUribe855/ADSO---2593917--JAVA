import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector");
        int n = datos_entrada.nextInt();

        int [] vector = new int[n];

        for( int k = 0; k < vector.length; k++){
            System.out.print("Ingrese un numero: ");
            vector[k] = datos_entrada.nextInt();
        }

        int auxiliar = 0;

        for(int i = 0; i < vector.length-1; i++){
            for(int j = 0;j < vector.length-1; j++){
                if(vector[j] < vector[j+1]){
                    auxiliar = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = auxiliar;
                }
            }
        }

        for(int m = 0; m < vector.length; m++){
            System.out.print(vector[m]);
        }
    }
}