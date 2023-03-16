import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector");
        int n = datosEntrada.nextInt();

        int vector [] = new int[n];

        for(int i = 0; i < vector.length;i++){
            System.out.print("Ingrese el numero de la posicion "+i+" del vector");
            vector[i] = datosEntrada.nextInt();
        }

        System.out.print("Ingrese el numero de la posicion donde desea iniciar");
        int posicion = datosEntrada.nextInt();

        for(int j =0; j < vector.length; j++){
            System.out.print("[" + vector[j]+ "]");
        }
        System.out.println(" ");
        for(int m = posicion; m >= 0; m--){
            System.out.print("[" + vector[m]+"]");
        }
        for(int l = n-1; l > posicion;l--){
            System.out.print("["+vector[l]+"]");
        }
    }
}