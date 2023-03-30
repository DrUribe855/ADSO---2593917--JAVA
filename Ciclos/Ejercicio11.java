import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[]args){
        
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 1 y 6: ");
        int entrada = datos_entrada.nextInt();
        int i = 1;
        int aux = 0;
        int random = 0;
        int producto = 0;
        for (i=1; i <= entrada; i++){
            random = (int)(Math.random()*10);
            aux = aux*10+random;
        }
        System.out.println("El numero construido es: "+ aux);
        producto = aux*2;
        System.out.println("El resultado del producto es: "+producto);
    }
}