import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Escriba el tamaña que tendra el arreglo: ");
        int n = datos_entrada.nextInt();

        int vector [] = new int[n];

        for(int i = 0; i < vector.length; i++){
            vector[i] = (((i+1)*2)-1);
        }  
        for(int j = 0;j < vector.length; j++){
            System.out.println("Numero: "+vector[j]);
        }
    }
}