import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner textInput = new Scanner(System.in);
        Scanner numericalInput = new Scanner(System.in);

        int menuOption = 0;
        int registeredCustomers = 0;
        int availableMemory = 10;
        Persona array [] = new Persona[10];

        do{
            System.out.println("|| --------------------------------------- ||");
            System.out.println("|| ----------- SECCION CLIENTES -----------||");
            System.out.println("|| --------------------------------------- ||");
            System.out.println("||             Clientes registrados "+registeredCustomers+"   ||");
            System.out.println("||                                         ||");
            System.out.println("|| 1. Registrar Cliente.                   ||");
            System.out.println("|| 2. Ver clientes registrados.            ||");
            System.out.println("|| 3. Modificar informacion del cliente    ||");
            System.out.println("|| 4. Ver informacion del cliente          ||");
            System.out.println("|| 5. Eliminar cliente                     ||");
            System.out.println("|| 6. Salir                                ||");
            System.out.println("|| --------------------------------------- ||\n\n");
            System.out.print("Ingrese una opcion ==> ");
            menuOption = numericalInput.nextInt();
            if(menuOption == 1){
                System.out.print("Ingrese su numero de documento ");
                int documentNumber = numericalInput.nextInt();
                System.out.print("Ingrese su(s) nombre(s) ");
                String name = textInput.nextLine();
                System.out.print("Ingrese sus apellidos ");
                String lastname = textInput.nextLine();
                System.out.print("Ingrese su direccion ");
                String address = textInput.nextLine();
                System.out.print("Ingrese su email ");
                String email = textInput.nextLine();
                Persona temporal = new Persona(documentNumber, name, lastname, address, email);

                boolean valid = true;

                for(int i = 0; i < registeredCustomers; i++){
                    if(temporal.getDocument() == array[i].getDocument()){
                        valid = false;
                        System.out.println("|| ===== El documento ingresado ya se encuentra registrado en el sistema");
                        break;
                    }
                }

                if(valid){
                    array[registeredCustomers] = temporal;
                    registeredCustomers++;
                    availableMemory--;
                    System.out.println("|| REGISTRADO CON EXITO ||\n\n");
                }
            }else if(menuOption == 2){
                for(int i = 0; i < registeredCustomers; i++){
                    System.out.println(array[i].getDocument()+" -> " + array[i].getName()+" "+array[i].getLastname());
                }
            }else if(menuOption == 3){
                System.out.println("Esta es la lista de clientes: ");
                for(int i = 0; i < registeredCustomers; i++){
                    System.out.println(array[i].getDocument()+" -> " + array[i].getName()+" "+array[i].getLastname());
                }
                int modificationOption = 0;
                    System.out.print("\n Ingrese el documento del usuario al cual desea modificar datos  ");
                    int searchDocument = numericalInput.nextInt();
                    boolean repeated = false;
                    int position = 0;
                    do{
                        // for(){
                            if(searchDocument == array[j].getDocument()){
                                repeated = true;
                                System.out.println("¿Que dato desea modificar?");
                                System.out.println("1. Numero de documento    ");
                                System.out.println("2. Nombres                ");
                                System.out.println("3. Apellidos              ");
                                System.out.println("4. Direccion              ");
                                System.out.println("5. Email                  ");
                                System.out.println("6. Salir                  ");
                                modificationOption = numericalInput.nextInt();
                                if(modificationOption == 1){
                                    System.out.print("Ingrese el nuevo documento ");
                                    int documentChanged = numericalInput.nextInt();
                                    for(int y = 0; y < registeredCustomers; y++){
                                        if(documentChanged == array[y].getDocument()){
                                            System.out.print("Este documento ya se encuentra registrado ");
                                        }else{
                                            array[j].setDocument(documentChanged);
                                        }
                                    }
                                }else if(modificationOption == 2){
                                    System.out.print("Ingrese los nuevos nombres ");
                                    String nameChanged = textInput.nextLine();
                                    array[j].setName(nameChanged);
                                }else if(modificationOption == 3){
                                    System.out.print("Ingrese los apellidos ");
                                    String lastnameChanged = textInput.nextLine();
                                    array[j].setLastname(lastnameChanged);
                                }else if(modificationOption == 4){
                                    System.out.print("Ingrese la nueva direccion ");
                                    String addressChanged = textInput.nextLine();
                                    array[j].setAddress(addressChanged);
                                }else if(modificationOption == 5){
                                    System.out.print("Ingrese el nuevo email ");
                                    String emailChanged = textInput.nextLine();
                                    array[j].setEmail(emailChanged);
                                }else if(modificationOption == 6){
                                    System.out.print("|| ====== SALIENDO ===== ||");
                                }else{
                                    System.out.print("|| ====== Opcion invalida ===== ||");
                                }
                            }
                        // }
                    }while(modificationOption != 6);
            }
        }while(menuOption != 6);
    }
}