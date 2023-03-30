import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un numero (El numero no debe ser mayor de 6 digitos): ");
        int numero_ingreso = datos_entrada.nextInt();

        int i = 1;
        int j = 0;
        int numero_invertido = 0;
        int digito = 0;

        while(j <= 0){
            digito = numero_ingreso%10;
            numero_invertido = (numero_invertido*10)+digito;
            numero_ingreso = numero_ingreso/10;
            if(numero_ingreso == 0){
                break;
            }
        }

        int n;
        while( i <= 6){
            n = numero_invertido%10;
            System.out.println("El digito" + i + " es: " + n);
            numero_invertido = numero_invertido/10;
            i++;
        }
    }
}