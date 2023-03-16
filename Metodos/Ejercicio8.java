import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese una frase => ");
        String phrase = datosEntrada.nextLine();

        System.out.print("Ingrese un numero => ");
        int position = datosEntrada.nextInt();

        char vector [] = new char[phrase.length()+1];

        for(int i = 0; i <= phrase.length()-1;i++){
            vector[i] = phrase.charAt(i);
        }
        for(int j = position; j <= phrase.length(); j++){
            System.out.print(vector[j]);
        }
        //circulo
        for(int y = 0; y < position; y++){
            System.out.print(vector[y]);
        }
    }
}