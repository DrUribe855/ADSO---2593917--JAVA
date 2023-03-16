import java.util.Scanner;

public class Ejercicio23{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Indique el tamano del vector ");
        int arraysLength = datosEntrada.nextInt();

        String arrayStrings [] = new String[arraysLength];

        for(int i = 0; i < arraysLength; i++){
            System.out.print("Ingrese la palabra ");
            arrayStrings[i] = teclado.nextLine();
        }

        System.out.print("Ingrese una palabra: ");
        String searchWord = teclado.nextLine();

        for(int j = 0; j < arraysLength; j++){
            int position = arrayStrings[j].indexOf(searchWord);
            if(position != -1){
                System.out.println(" => Posicion " + j + ": " + arrayStrings[j]);
            }
        }
    }
}