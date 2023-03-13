import java.util.Scanner;

public class Principal{
    public static void main(String[]args){

        Scanner numericInput = new Scanner(System.in);
        Scanner textInput = new Scanner(System.in);

        int actualPosition = 0;
        Persona array [] = new Persona[100];
        boolean menuStatus = true;

        while(menuStatus){
            System.out.println("||------------------------------------||");
            System.out.println("||-------------- PERSONAS ------------||");
            System.out.println("||------------------------------------||");
            System.out.println("||              Personas registradas: ||" + actualPosition);
            System.out.println("||                                    ||");
            System.out.println("|| 1. Registrar persona.              ||");
            System.out.println("|| 2. Ver lista de personas.          ||");
            System.out.println("|| 3. Ordenar lista de personas       ||");
            System.out.println("|| 4. Salir");
            System.out.println("||------------------------------------||");
            int menuOption = numericInput.nextInt();
            if(menuOption == 1){
                System.out.println("Ingrese su cedula ");
                int documentNumber = numericInput.nextInt();
                System.out.println("Ingrese su telefono ");
                int phoneNumber = numericInput.nextInt();
                System.out.println("Ingrese su nombre ");
                String name = textInput.nextLine();
                System.out.println("Ingrese su apellido ");
                String lastname = textInput.nextLine();
                System.out.println("Ingrese su direccion ");
                String address = textInput.nextLine();
                System.out.print("Ingrese su email ");
                String email = textInput.nextLine();
                Persona temporal = new Persona(documentNumber,phoneNumber,name,lastname,address,email);
                array[actualPosition] = temporal;
                actualPosition++;
            }else if(menuOption == 2){
                for(int i = 0; i < actualPosition; i++){
                    if(array != null){
                        array[i].printInformation();
                    }
                }
            }else if(menuOption == 3){
                for(int i = 0; i < array.length;i++){
                    for(int j = 0; j < array.length; j++){
                        if(array[j] != null && array[j+1] != null){
                            if(array[j].getName().compareToIgnoreCase(array[j+1].getName()) > 0){
                                Persona aux = array[j];
                                array[j] = array[j+1];
                                array[j+1] = aux;
                            }
                        }
                    }
                }
            }else if(opcion == 4){
                System.out.println("|| ========= SALIENDO ======== ||");
                System.out.println("||-----------------------------||");
                menuStatus = false;
            }
        }
    }
}