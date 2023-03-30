import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);
        
        int opcion_salida = 0;
        while (opcion_salida !=3){
            System.out.println("|------Bienvenido------|");
            System.out.println("|1. Docente            |");
            System.out.println("|2. Estudiante         |");
            System.out.println("|3. Salir              |");
            System.out.println("|----------------------|");
            opcion_salida = datos_entrada.nextInt();
                if (opcion_salida == 1){
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
            }else if(opcion_salida == 2){
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
    }
}