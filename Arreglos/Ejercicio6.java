import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = datos_entrada.nextInt();

        int vector []= new int [n];

        for(int i = 0;i < vector.length;i++){
            System.out.print(" Numero: ");
            vector[i] = datos_entrada.nextInt();
        }
        for(int i = 0; i < vector.length; i++){
            System.out.println("numeros: " + vector[i]);
        }

        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        for(int i = 0; i < vector.length; i++){
            int x = 1;
            int acumulador = 0;
            while(x <= vector[i]){
                if(vector[i]%x==0){
                    acumulador++;
                }
                x++;
            }
            if(acumulador == 2){
                contadorPrimos++;
            }else{
                contadorNoPrimos++;
            }
        }

        int [] primos = new int[contadorPrimos];
        int [] noPrimos = new int [contadorNoPrimos];

        contadorPrimos = 0;
        contadorNoPrimos = 0;

        for(int i = 0; i < vector.length; i++){
            int x = 1;
            int acumulador = 0;
            while(x <= vector[i]){
                if(vector[i]%x==0){
                    acumulador++;
                }
                x++;
            }
            if(acumulador == 2){
                primos[contadorPrimos] = vector[i];
                contadorPrimos++;
            }else{
                noPrimos[contadorNoPrimos] = vector[i];
                contadorNoPrimos++;
            }
        }

        System.out.println("Numeros primos: ");
        for(int i = 0; i < contadorPrimos;i++){
            System.out.print(primos[i]);
        }
        System.out.println("Numeros NO primos: ");
        for(int i = 0; i < contadorNoPrimos; i++){
            System.out.print(noPrimos[i]);
        }

    }
}