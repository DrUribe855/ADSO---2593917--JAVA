import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese palabra 1 => ");
        String firstWord = datosEntrada.nextLine();

        System.out.print("Ingrese la palabra 2 => ");
        String secondWord = datosEntrada.nextLine();

        int lengthFirstWord = firstWord.length();
        int lengthSecondWord = secondWord.length();
        char arrayFirstWord [] = new char[lengthFirstWord];
        char arraySecondWord [] = new char[lengthFirstWord]; 

        int iterator = 0;

        if(lengthFirstWord == lengthSecondWord){
            for(int i = 0; i <= lengthFirstWord-1; i++){
                arrayFirstWord[i] = firstWord.charAt(i);
                arraySecondWord[i] = secondWord.charAt(i);
            }
            for(int j = 0; j <= lengthFirstWord-1; j++){
                System.out.print(arrayFirstWord[j]);
                System.out.print(arraySecondWord[j]);
            }
        }else if(lengthFirstWord > lengthSecondWord){
            for(int i = 0; i <= lengthFirstWord-1;i++){
                System.out.print(firstWord.charAt(i));
                System.out.print(secondWord.charAt(iterator));
                if(iterator == lengthSecondWord-1){
                    iterator = 0;
                }else{
                    iterator++;
                }
            }
        }
    }
}