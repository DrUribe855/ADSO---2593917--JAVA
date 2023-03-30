import java.util.Scanner;
public class Ejercicio3{
    public static void main (String[]args){
        Scanner datos_entrada = new Scanner (System.in);

        System.out.print("Ingrese la altura: ");
        int altura = datos_entrada.nextInt();

        for (int i = 1; i <= altura; i++){
            for(int e = 1; e <= altura - i; e++){
                System.out.print(" ");
            }
            for (int x = 1;x <= (i*2)-1; x++){
                System.out.print("x");
            }
            System.out.println("");
        }
    }
}