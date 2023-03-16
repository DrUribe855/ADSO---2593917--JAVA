import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("=> Ingresar un nombre: ");
        String username = datos_entrada.nextLine();

        int longitud = username.length();
        char characters [] = new char[longitud];
        char invertidos [] = new char[longitud];
        
       for(int i = 0; i < longitud; i++){
            characters[i] = username.charAt(i);
       }
       int k = 0;
       for(int j = longitud-1; j >= 0 ; j--){
            invertidos[k] = characters[j];
            k++;
       }
       System.out.print("Nombre invertido: " + String.copyValueOf(invertidos));
    }
}