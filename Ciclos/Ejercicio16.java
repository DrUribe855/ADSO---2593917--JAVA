import java.util.Scanner;

public class Ejercicio16{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero");
        int numero1 = datos_entrada.nextInt();

        System.out.print("Ingrese el segundo numero");
        int numero2 = datos_entrada.nextInt();
        int suma = 1;
        int i = numero1;

        while(i <= numero2){
            int j = 1;
            while(j <= i){
                suma *=j;
                if(j==i){
                    System.out.println(j + " = " + suma);
                    suma = 1;
                }else{
                    System.out.print(j + " * ");
                }
                j++;
            }
            i++;
        }
       
        // suma = 1;
    }
}
