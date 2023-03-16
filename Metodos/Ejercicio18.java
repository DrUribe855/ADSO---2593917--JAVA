import java.util.Scanner;

public class Ejercicio18{
    public static void main(String[]args){
        
        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del vector");
        int tamano = datosEntrada.nextInt();

        int numeros [] = new int[tamano];
        int longitudPrimos = 0;
        int longitudNoPrimos = 0;
        for(int i = 0; i < tamano; i++){
            System.out.print("Ingrese un numero");
            numeros[i] = datosEntrada.nextInt();
            int j = 1;
            int contador = 0;
            while( j <= numeros[i]){
                if(numeros[i]%j==0){
                    contador++;
                }
                j++;
            }
            
            if(contador == 2){
                longitudPrimos++;
            }else{
                longitudNoPrimos++;
            }
        }

        int primos [] = new int[longitudPrimos];
        int noPrimos [] = new int[longitudNoPrimos];
        longitudNoPrimos = 0;
        longitudPrimos = 0;

        for(int i = 0; i < tamano; i++){
            int j = 1;
            int contador = 0;
            while( j <= numeros[i]){
                if(numeros[i]%j==0){
                    contador++;
                }
                j++;
            }
            
            if(contador == 2){
                primos[longitudPrimos] = numeros[i];
                longitudPrimos++;
            }else{
                noPrimos[longitudNoPrimos] = numeros[i];
                longitudNoPrimos++;
            }
        }

        System.out.print("Arreglo original: ");
        for(int i = 0; i < tamano;i++){
            System.out.print(" { " + numeros[i] + " }");
        }
        System.out.println(" ");
        System.out.print("Arreglo primos: ");
        for(int i = 0; i < longitudPrimos;i++){
            System.out.print(" { "+ primos[i] + " }");
        }
        System.out.print("Longitud primos: "+longitudPrimos);
        System.out.println(" ");
        System.out.print("Arreglo no primos: ");
        for(int i = 0; i < longitudNoPrimos;i++){
            System.out.print(" { "+noPrimos[i]+ " }");
        }
        System.out.print("Longitud no primos: "+longitudNoPrimos);

    }
}