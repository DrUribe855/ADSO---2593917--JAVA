import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);

        //Pedimos los datos
        System.out.print("Ingresar una oracion: ");
        String oracion = datos_entrada.nextLine();

        int longitud = oracion.length();
        int vocales = 0;

        char letras [] = new char [longitud];

        for(int i = 0; i < longitud; i++){
            letras[i] = oracion.charAt(i);
        }
        for(int j = 0; j < longitud; j++){
            if(letras[j] == 'A' || letras[j] == 'a'){
                vocales++;
            }else if(letras[j] == 'E' || letras[j] == 'e'){
                vocales++;
            }else if(letras[j] == 'I' || letras[j] == 'i'){
                vocales++;
            }else if(letras[j] == 'O' || letras[j] == 'o'){
                vocales++;
            }else if(letras[j] == 'U' || letras[j] == 'u'){
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales es: " + vocales); 
    }
}