import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[]args){
        
        Scanner datosEntrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de nombres que ingresara ");
        int arrayLength = datosEntrada.nextInt();

        String arrayNames [] = new String[arrayLength];
        String auxiliar = "";
        
        for(int i = 0; i < arrayLength; i++){
            System.out.print("Ingrese el nombre numero "+i+": ");
            arrayNames[i] = datosEntrada.next();
            
        }
        for(int j = 0; j < arrayLength; j++){
            for(int y = 0; y < arrayLength; y++){
                if(arrayNames[j].compareToIgnoreCase(arrayNames[y]) < 0){
                    auxiliar = arrayNames[y];
                    arrayNames[y] = arrayNames[y+1];
                    arrayNames[y+1] = auxiliar;
                }
            }
        }
        System.out.println("Orden alfabetico");
        for(int m = 0; m < arrayNames.length; m++){
            System.out.println("Nombre: "+arrayNames[m]);
            
        }
    }
}