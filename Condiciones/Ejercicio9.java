import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("--> Ingresar un numero: ");
        int numero_ingreso = datos_entrada.nextInt();
        
        int acumulador = 0;

        for(int i = 1; i < numero_ingreso; i++){

            int operacion = numero_ingreso%i;

            if(operacion == 0){
                acumulador = acumulador + 1;
            }
        }
        if(acumulador <= 2){
            System.out.print("El numero ingresado es primo");
        }else{
            System.out.print("El numero ingresado no es primo");
        }
    }
}