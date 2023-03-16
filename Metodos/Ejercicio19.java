import java.util.Scanner;

public class Ejercicio19{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del vector");
        int tamano = datosEntrada.nextInt();

        int vector [] = new int[tamano];

        for(int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero: ");
            vector[i] = datosEntrada.nextInt();
        }

        for(int j = 0; j < vector.length; j++){
            System.out.print("[" + vector[j]+ "]");
        }

        System.out.print("Ingrese el numero de movimientos: ");
        int movimientos = datosEntrada.nextInt();
        int auxiliar = 0;
        for(int m = 0; m < movimientos; m++){
            for(int x = 0; x < vector.length; x++){
                if(x == 0 ){
                    auxiliar = vector[0];
                }else{
                    vector[x-1] = vector[x];
                }
            }
            vector[tamano-1] = auxiliar;
            for(int v = 0; v < vector.length; v++){
                System.out.print(vector[v]);
            }
            System.out.println(" ");
        }

    }
}