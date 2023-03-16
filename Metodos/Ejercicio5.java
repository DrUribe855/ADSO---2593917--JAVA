import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[]args){

        Scanner datos_entrada = new Scanner(System.in);

        int errores = 0;
        char palabraRespuesta [] = new char[8];
        String palabra = "clasismo";

        //Generar guiones en el arreglo
        for(int i = 0; i < 8; i++){
            palabraRespuesta[i] = '_';
            System.out.print(palabraRespuesta);
        }
        //Ingreso del nombre
        System.out.print("Ingrese su nombre => ");
        String username = datos_entrada.nextLine();


        //Seleccion de opcion
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Salir");
        int option = datos_entrada.nextInt();
        if(option == 1){
            System.out.println(" _ _ _ _ _ _ _ _ ");
            for(int j = 0; j < 10; j++){
                String respuesta = String.copyValueOf(palabraRespuesta);
                boolean validacionGanador = palabra.equals(respuesta);
                if(validacionGanador == true){
                    System.out.print("Felicidades, ha completado la palabra");
                    break;
                }else{
                    System.out.println("Ingrese una letra");
                    char letraIngresada = datos_entrada.next().charAt(0);
                if(letraIngresada == 'c'){
                    palabraRespuesta[0] = 'c';
                    for(int y = 0; y < 8; y++){
                        System.out.print(" "+palabraRespuesta[y]+" ");
                    }
                }else if(letraIngresada == 'l'){
                    palabraRespuesta[1] = 'l';
                    for(int y = 0; y < 8; y++){
                        System.out.print(" "+palabraRespuesta[y]+" ");
                    }
                }else if(letraIngresada == 'a'){
                    palabraRespuesta[2] = 'a';
                    for(int y = 0; y < 8; y++){
                        System.out.print(" "+palabraRespuesta[y]+" ");
                    }
                }else if(letraIngresada == 's'){
                    palabraRespuesta[3] = 's'; 
                    palabraRespuesta[5] = 's';
                    for(int y = 0; y < 8; y++){
                        System.out.print(" "+palabraRespuesta[y]+" ");
                    }
                }else if(letraIngresada == 'i'){
                    palabraRespuesta[4] = 'i';
                    for(int y = 0; y < 8; y++){
                        System.out.print(" "+palabraRespuesta[y]+" ");
                    }
                }else if(letraIngresada == 'm'){
                    palabraRespuesta[6] = 'm';
                    for(int y = 0; y < 8; y++){
                        System.out.print(" "+palabraRespuesta[y]+" ");
                    }
                }else if(letraIngresada == 'o'){
                    palabraRespuesta[7] = 'o';
                    for(int y = 0; y < 8; y++){
                        System.out.print(" "+palabraRespuesta[y]+" ");
                    }
                }else{
                    errores++;
                    System.out.println("Letra incorrecta. Cantidad de errores: " + errores);
                    }

                if(errores == 10){
                    System.out.print("Game over");
                }
                }
            }
            
        }else if(option == 2){
            System.out.print("Gracias por jugar!");
        }
    }
}