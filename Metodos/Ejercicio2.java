import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingresar una oracion: ");
        String oracion = datos_entrada.nextLine();

        int longitud = oracion.length();
        char letras [] = new char [longitud];
        int numeros [] = new int [longitud];


        for(int i = 0; i < longitud; i++){
            // letras[i] = oracion.charAt(i);
            numeros[i] = (int) oracion.charAt(i);
        }
        for(int j = 0; j < longitud; j++){
            if(numeros[j] >= 65 && numeros[j] <= 90){
                numeros[j] = numeros[j] + 32;
                letras[j] = (char) numeros[j];
            }else if(numeros[j] >= 97 && numeros[j] <= 122){
                numeros[j] = numeros[j] - 32;
                letras[j] = (char) numeros[j];
            }else if(numeros[j] == 32){
                numeros[j] = 32;
                letras[j] = (char) numeros[j];
            }else if(numeros[j] == 64){
                numeros[j] = 64;
                letras[j] = (char) numeros[j];
            }else if(numeros[j] == 46){
                numeros[j] = 46;
                letras[j] = (char) numeros[j];
            }else if(numeros[j] == 42){
                numeros[j] = 42;
                letras[j] = (char) numeros[j];
            }
        }
        String nuevaFrase = String.copyValueOf(letras); 
        System.out.print("Oracion invertida: " + nuevaFrase);
    }
}