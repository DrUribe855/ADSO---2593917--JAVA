import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero del tamaño del arreglo: ");
        int n = datos_entrada.nextInt();

        int [] vector = new int[n];
        for(int i = 0; i < vector.length; i++){
            int m = 1;
            while(m <= n){
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
                    vector[i] = random;
                }
            }
        }
        for(int k = 0; k < vector.length; k++){
            System.out.println("Numero: "+vector[k]);
        }    
    }
}