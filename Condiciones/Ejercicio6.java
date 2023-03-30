import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        int numero0 = 0;
        int numero1 = 1;
        int suma = 0;
        int ingreso = 0;
        System.out.print("Ingrese un numero: ");
        ingreso = datos_entrada.nextInt();
        for (int i =  0; i < ingreso; i++){
            suma = numero0 + numero1;
            numero0 = numero1;
            numero1 = suma;
        }
        System.out.print(suma);
    }   
}