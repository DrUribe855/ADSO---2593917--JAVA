import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[]args){

        Scanner datos_entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer usuario");
        String firstUser = datos_entrada.nextLine();

        System.out.println("Ingrese el nombre del segundo usuario");
        String secondUser = datos_entrada.nextLine();

        System.out.println("Seleccione una opción");
        System.out.println("1. Iniciar juego.");
        System.out.println("2. Salir.");
        int turno = 1;
        int loginOption = datos_entrada.nextInt();
        int gameStatus = 0;
        char recuadro [] = {'_','_','_','_','_','_','_','_','_'};
        if(loginOption == 1){
            System.out.println(recuadro[0] + " " + recuadro[1] + " " + recuadro[2] + " ");
            System.out.println(recuadro[3] + " " + recuadro[4] + " " + recuadro[5] + " ");
            System.out.println(recuadro[6] + " " + recuadro[7] + " " + recuadro[8] + " ");
            while(gameStatus < 9){
                // Usuario 1
                char ficha = ((turno==1)? 'x':'o');

                System.out.println("Turno del jugador " + ((turno==1)? firstUser:secondUser));
                System.out.println("Ingrese la posición en que desea hacer el movimiento: ");
                int movementUser1 = datos_entrada.nextInt();
                
                if(recuadro[movementUser1] == '_'){
                    recuadro[movementUser1] = ficha;
                    System.out.println(recuadro[0] + " " + recuadro[1] + " " + recuadro[2] + " ");
                    System.out.println(recuadro[3] + " " + recuadro[4] + " " + recuadro[5] + " ");
                    System.out.println(recuadro[6] + " " + recuadro[7] + " " + recuadro[8] + " ");
                    gameStatus++;
                    
                    if( recuadro[0] == ficha && recuadro[1] == ficha && recuadro[2] == ficha|| 
                        recuadro[3] == ficha && recuadro[4] == ficha && recuadro[5] == ficha||
                        recuadro[6] == ficha && recuadro[7] == ficha && recuadro[8] == ficha ||
                        recuadro[0] == ficha && recuadro[4] == ficha && recuadro[8] == ficha ||
                        recuadro[2] == ficha && recuadro[4] == ficha && recuadro[6] == ficha ||
                        recuadro[0] == ficha && recuadro[3] == ficha && recuadro[6] == ficha||
                        recuadro[2] == ficha && recuadro[5] == ficha && recuadro[8] == ficha){
                            System.out.println("El ganador es el jugador: " + ((turno==1)? firstUser:secondUser) );
                            System.out.println(recuadro[0] + " " + recuadro[1] + " " + recuadro[2] + " ");
                            System.out.println(recuadro[3] + " " + recuadro[4] + " " + recuadro[5] + " ");
                            System.out.println(recuadro[6] + " " + recuadro[7] + " " + recuadro[8] + " ");
                            break;
                    }else{
                        if(turno == 1){
                            turno = 2;
                        }else if(turno == 2){
                            turno = 1;
                        }
                    }
                }
                
                if(gameStatus == 8){
                    System.out.print("El juego termino en empate");
                }
            }
        }
    }
}