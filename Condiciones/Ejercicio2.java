import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){

        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de materias: ");
        float cantidad_materias = datos_entrada.nextFloat();

        int creditos_semestre = 0;
        float notas_totales = 0;
        float promedio_ponderado = 0;

        for(int i = 1;i <= cantidad_materias; i++){
            System.out.print("Nota materia "+i+" = ");
            float nota_materia = datos_entrada.nextFloat();
            System.out.print("Creditos Materia "+i+" = ");
            int creditos_materia = datos_entrada.nextInt();

            creditos_semestre = creditos_semestre + creditos_materia;
            notas_totales = notas_totales + (nota_materia * creditos_materia);
        }
        promedio_ponderado = notas_totales / creditos_semestre;
        System.out.println("Total de creditos : "+creditos_semestre);
        System.out.println("Promedio del semestre: "+ promedio_ponderado);
    }
}

