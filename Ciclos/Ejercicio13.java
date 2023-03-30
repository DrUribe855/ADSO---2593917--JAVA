import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner (System.in);

        int i = 1;
        System.out.print("Ingrese un numero entero");
        int numero_ingreso = datos_entrada.nextInt();
        while(i <= numero_ingreso){
            int contador = 0;
            int j = 1;
            int aleatorio = (int)(Math.random()*99);
            while(j <= aleatorio){
                if (aleatorio%j == 0){
                    contador++;
                }
                j++;
            }
            if(contador == 2){
                System.out.println("El primo"+ i +" generado es: "+ aleatorio);
                i++;
            }
        }
    }
}