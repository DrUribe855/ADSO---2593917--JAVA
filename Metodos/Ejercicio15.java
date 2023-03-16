import java.util.Scanner;

public class Ejercicio15{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        int pagosMensuales [] = new int[12];
        int loginOption = 0;

        do{
            System.out.println("1: Registar pago mensual");
            System.out.println("2: Ver pago todos los meses");
            System.out.println("3: Ver pago mes especifico");
            System.out.println("4: Salir");
            loginOption = datosEntrada.nextInt();
            if(loginOption == 1){
                System.out.println("Ingrese el mes al que desea asignar el pago");
                int month = datosEntrada.nextInt();
                System.out.println("Ingrese el monto a pagar");
                int monto = datosEntrada.nextInt();
                pagosMensuales[month] = monto;
                
            }else if(loginOption == 2){
                for(int i = 0; i < 12; i++){
                System.out.println("Mes "+i+": "+pagosMensuales[i]);

                }

            }else if(loginOption == 3){
                System.out.println("Ingrese el numero del mes que desea ver el pago");
                int month = datosEntrada.nextInt();
                System.out.println("Este es el pago asignado al mes "+month+": "+pagosMensuales[month]);


            }
        }while(loginOption < 4);
    }
}