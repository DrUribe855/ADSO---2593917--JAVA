import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[]args){
        Scanner datos_entrada = new Scanner(System.in);
        
        
        // Algoritmo para crear el dia
        int dia_random = 0;
        dia_random = (int)(Math.random()*31);

        //Algoritmo para crear el mes 
        boolean meses = true;
        int mes_random = 0;
        while(meses == true){
            mes_random = (int)(Math.random()*12);
            if(mes_random > 0){
                if(dia_random == 31 && (mes_random == 1 || mes_random == 3 || mes_random == 5 || mes_random == 7 || mes_random == 8 || mes_random == 10 || mes_random == 12)){
                    meses = false;
                }else if(dia_random == 30 && (mes_random == 4 || mes_random == 6 || mes_random == 9 || mes_random == 11)){
                    meses = false;
                }else if(dia_random == 28 && mes_random == 2){
                    meses = false;
                }else if(dia_random < 30){
                    meses = false;
                }
            }
        }

        //Algoritmo para crear el año
        boolean anos = true;
        int anos_random = 0;
        while(anos == true){
            anos_random = (int)(Math.random()*9999);
            if(anos_random > 999 && anos_random <= 9999){
                anos = false;
            }
        }
        
        if(dia_random > 0 && dia_random < 10 && mes_random > 0 && mes_random <10){
            System.out.println("0" + dia_random + "/0" + mes_random + "/" + anos_random);
        }else if(dia_random > 0 && dia_random < 10){
            System.out.println("0"+ dia_random + "/" + mes_random + "/" + anos_random);
        }else if(mes_random > 0 && mes_random < 10){
            System.out.print(dia_random + "/0" + mes_random + "/" + anos_random);
        }else{
            System.out.println(dia_random + "/" + mes_random + "/" + anos_random);
        }
    }
}