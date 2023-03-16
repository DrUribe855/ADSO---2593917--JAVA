import java.util.Scanner;

public class Ejercicio22{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese el tamano del vector ");
        int arrayLength = datosEntrada.nextInt();

        int numbers[] = new int[arrayLength];
        for(int i = 0; i < arrayLength;i++){
            numbers[i] = (i+1);
        }
        System.out.print("Ingrese posicion ");
        int position = datosEntrada.nextInt();
        if(position > arrayLength){
            for(int i = 0; i < numbers.length; i++){
                System.out.print(numbers[i]);
            }
            int searchPosition = position - arrayLength;
            System.out.println("Posicion: " + position);
            System.out.println("Valor: "+ numbers[searchPosition-1]);
        }else if(position < 0){
            for(int i = 0; i < numbers.length; i++){
                System.out.print(numbers[i]);
            }
            System.out.println("Posicion: " + position);
            position = position*-1;
            System.out.println("Valor: "+numbers[arrayLength-position]);
        }
    }   
}