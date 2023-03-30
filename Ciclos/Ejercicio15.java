import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero_ingreso = datos_entrada.nextInt();
        int suma = 1;
        for(int i = 1; i <= numero_ingreso; i++){
            suma = suma*i;
            if (i == numero_ingreso){
                System.out.print(i + " = ");
            }else{
                System.out.print(i +  " * ");
            }
        }
        System.out.print(suma);
    }
}