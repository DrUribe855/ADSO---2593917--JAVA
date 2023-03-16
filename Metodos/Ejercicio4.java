import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese palabra: ");
        String word = datos_entrada.nextLine();

        int longitud = word.length();

        char characters [] = new char[longitud];
        char invertido [] = new char[longitud];

        for(int i = 0; i < longitud; i++){
            characters[i] = word.charAt(i);
        }
        int y = 0;
        for(int j = longitud-1; j >= 0; j--){
            invertido[y] = characters[j];
            y++;
        }
        String original = String.copyValueOf(characters);
        String inverted = String.copyValueOf(invertido);

        boolean comparacion = original.equals(inverted);
        if(comparacion == true){
            System.out.print("La palabra " + word + " es palindroma");
        }else{
            System.out.print("La palabra " + word + " NO es palindroma");
        }
    }
}