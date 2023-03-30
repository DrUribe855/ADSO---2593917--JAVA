import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero impar: ");
        int ingreso = datos_entrada.nextInt();
        int n = (ingreso+1)/2;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            for (int a = 0; a < (i*2)-1; a++){
                System.out.print("x");
            }
            System.out.println();
        }
        n = n-1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }

            for (int a = 0; a < ((n - i)*2)-1; a++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}