import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[]args){

        Scanner datos_entrada = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int auxiliar = 0;
        int i = 0;

        System.out.print("Ingrese el primer número: ");
        numero1 = datos_entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = datos_entrada.nextInt();
        System.out.print("Ingrese el tercer número: ");
        numero3 = datos_entrada.nextInt();

        auxiliar = numero1;
        if(numero2 > auxiliar){
            auxiliar = numero2;
        }
        if(numero3 > auxiliar){
            auxiliar = numero3;
        }
        i=auxiliar;
        while((i%numero1!=0)||(i%numero2!=0)||(i%numero3!=0)){
            i++;
        }
        System.out.print("El MCM es: "+i);
    }
}