import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner (System.in);

        System.out.print("Ingrese un número de máximo seis digitos: ");
        int numero_ingreso = datos_entrada.nextInt();

        int original = numero_ingreso;
        int ultimo = 0;
        int invertido = 0;
        while(numero_ingreso != 0){
            ultimo = numero_ingreso%10;
            invertido = (invertido*10) + ultimo;
            numero_ingreso = numero_ingreso/10;
        }
        
        if(invertido == original){
            System.out.print("El numero ingresado es palindromo: " + invertido);

        }else{
            System.out.print("El numero ingresado no es palindromo: " + invertido);
        }

    }
}
