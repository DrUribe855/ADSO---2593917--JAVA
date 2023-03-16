import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas que va a registrar: ");
        int cantidadPersonas = datosEntrada.nextInt();

        String names [] = new String[cantidadPersonas];
        String gender [] = new String[cantidadPersonas];

        for(int i = 0; i < cantidadPersonas; i++){
            System.out.println("Ingrese el nombre de la persona => ");
            names[i] = datosEntrada.next();
            System.out.println("Ingrese el genero de la persona => ");
            gender[i] = datosEntrada.next();
        }
        for(int j = 0; j < cantidadPersonas; j++){
            System.out.println("[ "+names[j]+" -> "+gender[j]+ " ]");
        }
    }
}