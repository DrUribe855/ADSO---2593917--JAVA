import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del vector");
        int tamano = datosEntrada.nextInt();

        int numeros [] = new int[tamano];
        int longitudPares = 0;
        int longitudImpares = 0;
        for(int i = 0; i < tamano; i++){
            System.out.print("Ingrese un numero");
            numeros[i] = datosEntrada.nextInt();
            if(numeros[i] % 2 == 0){
                longitudPares++;
            }else{
                longitudImpares++;
            }
        }
        int pares [] = new int[longitudPares];
        int impares [] = new int[longitudImpares];

        longitudPares = 0;
        longitudImpares = 0;
        for(int j = 0; j < tamano; j++){
            if(numeros[j] % 2 == 0){
                pares[longitudPares] = numeros[j];
                longitudPares++;
            }else{
               impares[longitudImpares] = numeros[j];
               longitudImpares++;
            }
        }
        System.out.print("Arreglo original: ");
        for(int i = 0; i < tamano;i++){
            System.out.print(" { " + numeros[i] + " }");
        }
        System.out.println(" ");
        System.out.print("Arreglo pares: ");
        for(int i = 0; i < longitudPares;i++){
            System.out.print(" { "+ pares[i] + " }");
        }
        System.out.print("Longitud pares: "+longitudPares);
        System.out.println(" ");
        System.out.print("Arreglo impares: ");
        for(int i = 0; i < longitudImpares;i++){
            System.out.print(" { "+impares[i]+ " }");
        }
        System.out.print("Longitud impares: "+longitudImpares);

    }
}