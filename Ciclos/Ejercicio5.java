import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        int numero0 = 0;
        int numero1 = 1;
        int suma = 0;
        int ingreso = 0;
        System.out.print("Ingrese un numero: ");
        ingreso = datos_entrada.nextInt();
        
        for (int i =  0; i < ingreso; i++){
            System.out.println(numero0);
            //C es la suma de A + B
            suma = numero0 + numero1;
            // Luego, A pasa a ser igual a B
            numero0 = numero1;
            //Para finalizar B pasa a ser igual a C
            numero1 = suma;
            //C hace la suma de los dos numeros, A pasa a ser B para avanzar
            //y B pasa a ser el nuevo numero que es el resultado de los dos numeros sumados anteriormente
        }
    }
}