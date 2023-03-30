import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        System.out.print("<---------- Escriba las notas decimales con una coma -------------->");
        System.out.print("Ingrese la nota de matematicas: ");
        int matematicas = datos_entrada.nextInt();
        System.out.print("Ingrese la nota de español: ");
        int espanol = datos_entrada.nextInt();
        System.out.print("Ingrese la nota de ingles: ");
        int ingles = datos_entrada.nextInt();
        System.out.print("Ingrese la nota de ciencias naturales: ");
        int naturales = datos_entrada.nextInt();
        System.out.print("Ingrese la nota de deportes: ");
        int deportes = datos_entrada.nextInt();

        if(matematicas > espanol && matematicas > ingles && matematicas > naturales && matematicas > deportes){
            System.out.print("La mejor nota fue: Matematicas");
        }else if(espanol > matematicas && espanol > ingles && espanol > naturales && espanol > deportes){
            System.out.print("La mejor nota fue: Espanol");
        }else if(ingles > matematicas && ingles > espanol && ingles > naturales && ingles > deportes){
            System.out.print("La mejor nota fue: Ingles");
        }else if(naturales > matematicas && naturales > espanol && naturales > ingles && naturales > deportes){
            System.out.print("La mejor nota fue: Ciencias naturales");
        }else if(deportes > matematicas && deportes > espanol && deportes > ingles && deportes > naturales){
            System.out.print("La mejor nota fue: Deportes");
        }

        if(matematicas < espanol && matematicas < ingles && matematicas < naturales && matematicas < deportes){
            System.out.print("La nota mas  baja fue: Matematicas");
            if(matematicas < 3){
                multiplicacion = 5*3;
                operacion = multiplicacion - espanol - ingles - naturales - deportes;
                System.out.print("Usted debió sacar: " + operacion);
            }
        }else if(espanol < matematicas && espanol < ingles && espanol < naturales && espanol < deportes){
            System.out.print("La nota mas baja fue: Espanol");
             if(espanol < 3){
                multiplicacion = 5*3;
                operacion = multiplicacion - matematicas - ingles - naturales - deportes;
                System.out.print("Usted debió sacar: " + operacion);
            }
        }else if(ingles < matematicas && ingles < espanol && ingles < naturales && ingles < deportes){
            System.out.print("La nota mas baja: Ingles");
             if(ingles < 3){
                multiplicacion = 5*3;
                operacion = multiplicacion - espanol - matematicas - naturales - deportes;
                System.out.print("Usted debió sacar: " + operacion);
            }
        }else if(naturales < matematicas && naturales < espanol && naturales < ingles && naturales < deportes){
            System.out.print("La nota mas baja fue: Ciencias naturales");
             if(naturales < 3){
                multiplicacion = 5*3;
                operacion = multiplicacion - espanol - ingles - matematicas - deportes;
                System.out.print("Usted debió sacar: " + operacion);
            }
        }else if(deportes < matematicas && deportes < espanol && deportes < ingles && deportes < naturales){
            System.out.print("La nota mas baja fue: Deportes");
             if(deportes < 3){
                multiplicacion = 5*3;
                operacion = multiplicacion - espanol - ingles - naturales - matematicas;
                System.out.print("Usted debió sacar: " + operacion);
            }
        }

        float promedio_semestre = (matematicas+espanol+ingles+naturales+deportes)/5;

        System.out.print("El promedio del estudiante es de: "+ promedio);


    }
}