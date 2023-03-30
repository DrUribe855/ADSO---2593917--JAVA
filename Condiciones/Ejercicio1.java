import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[]args){

        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese cantidad de notas");
            int cantidad_notas = datos_entrada.nextInt();

        float sumatoria = 0;
        
        for (int i = 1;i <= cantidad_notas;i++){
            System.out.print("Ingrese la nota"+i+": ");
            float nota = datos_entrada.nextFloat();
            sumatoria = sumatoria + nota;
        }
        float promedio = sumatoria/cantidad_notas;
        System.out.print("EL PROMEDIO ES: "+promedio);
    }
} 