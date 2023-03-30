import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = datos_entrada.nextInt();

        int [] vector = new int[n];

        for(int i = 0; i < vector.length;i++){
            System.out.print("Ingrese el numero de la posicion "+i+" del vector");
            vector[i] = datos_entrada.nextInt();
        }

        System.out.print("Ingrese el numero de la posicion que desea ver del vector");
        int posicion = datos_entrada.nextInt();


        //salidas
        for(int j = 0; j < vector.length; j++){
            System.out.print("["+vector[j]+"]");
        }
        System.out.println(" ");
        for(int m = posicion; m >= 0; m--){
            System.out.print("["+vector[m]+"]");
        }
        for(int l = n-1; l > posicion; l-- ){
            System.out.print("["+vector[l]+"]");
        }
    }
}