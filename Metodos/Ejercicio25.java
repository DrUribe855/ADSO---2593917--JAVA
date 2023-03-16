import java.util.Scanner;

public class Ejercicio25{
    public static void main(String[]args){

        //Iniciamos las variables de entrada
        
        Scanner datosEntrada = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        //Iniciamos los diferentes arreglos y variables usados en el codigo
        int availableMemory = 3;
        String municipios [] = new String[3];
        String departamentos [] = new String[3];
        int cantidadHabitantes [] = new int[100];
        int menorAltura [] = new int[100];
        int mayorAltura [] = new int[100];
        int iterador = 0;
        int loginOption = 0;
        String nuevoMunicipio = "";
        String nuevoDepartamento = ""; 
        
        //Iniciamos el ciclo padre mediante un do/while, para llevar a cabo el manejo del menu principal.
        do{
            //Imprimimos las diferentes opciones que tendra el usuario.
            System.out.println("Seleccione una opcion: ");
            System.out.println("                                                                  Memoria disponible: "+availableMemory);
            System.out.println("1. Registrar municipio ");
            System.out.println("2. Ver lista de municipios ");
            System.out.println("3. Ver informacion municipios ");
            System.out.println("4. Registrar numero de habitantes de un municipio ");
            System.out.println("5. Registrar altura sobre el nivel del mar ");
            System.out.println("6. Ver lista de departamentos registrados ");
            System.out.println("7. Ver informacion de departamento ");
            System.out.println("8. Eliminar municipio ");
            System.out.println("9. Eliminar departamento ");
            System.out.println("10. Salir ");
            loginOption = datosEntrada.nextInt();
            
            //Al seleccionar la primera opcion podra registrar un municipio con su respectivo departamento
            if(loginOption == 1){
                //En caso de que no haya espacio en memoria le saldra un mensaje indicandole dicha informacion.
                if(availableMemory == 0){
                    System.out.print("No hay espacio en memoria para registrar otro municipio/departamento ");
                }else{
                    //En caso de haber memoria disponible se le piden los datos.
                    System.out.println("Ingrese el nombre del municipio ");
                    nuevoMunicipio = teclado.nextLine();
                    System.out.println("Ingrese el nombre del departamento");
                    nuevoDepartamento = teclado.nextLine();
                    departamentos[iterador] = nuevoDepartamento;
                    boolean repetido = false;
                    //Al momento de recibir los datos se hace la verificacion para ver si el departamento ingresado no esta
                    //ya registrado en ese departamento
                    for(int i = 0; i < departamentos.length-1; i++){
                        if(nuevoDepartamento.equalsIgnoreCase(departamentos[i])){
                            if(nuevoMunicipio.equalsIgnoreCase(municipios[i])){
                                repetido = true;
                            } 
                        }
                    }
                    //Si este mismo ya se encuentra registrado se le notificara al usuario
                    if(repetido == true){
                        System.out.println("El dato ingresado ya se encuentra en la base de datos");
                    }else{
                        //Sino se agregara al arreglo, el iterador aumentara y el espacio de memoria disminuira.
                        municipios[iterador] = nuevoMunicipio;
                        iterador++;
                        availableMemory--;
                    }
                }
            //Al seleccionar la opcion 2 se le mostrara todos los departamentos registrados.
            }else if(loginOption == 2){
                for(int i = 0; i < municipios.length; i++){
                    System.out.println("ID: " + i + " - " + "Municipio: "+municipios[i]);
                }
            //Al seleccionar la tercera opcion se le pedira el ID (posicion) del municipio. Al mostrarlo el usuario vera
            //nombre del municipio, cantidad de habitantes, mayor y menor altura.
            }else if(loginOption == 3){
                System.out.println("Ingrese el ID del municipio: ");
                int identificador = datosEntrada.nextInt();
                System.out.println("Nombre del municipio: " + municipios[identificador]);
                System.out.println("Cantidad de habitantes: " + cantidadHabitantes[identificador]);
                System.out.println("Altura mayor sobre el nivel del mar: " + mayorAltura[identificador]);
                System.out.println("Altura menor sobre el nivel del mar: " + menorAltura[identificador]);
            //Al selecionar la opcion 4 se le pedira el ID (posicion) del municipio y posteriormente la cantidad de habitantes.
            }else if(loginOption == 4){
                System.out.println("Ingrese el ID del municipio ");
                int identificador = datosEntrada.nextInt();
                System.out.println("Ingrese la cantidad de habitantes: ");
                cantidadHabitantes[identificador] = datosEntrada.nextInt();
                System.out.println("Los datos se han guardado correctamente: ");
            //Al seleccionar la opcion 5 se le pedira el ID (posicion) del municipio, posterior a eso la altura menor y mayor
            //del municipio.
            }else if(loginOption == 5){
                System.out.println("Ingrese el ID del municipio ");
                int identificador = datosEntrada.nextInt();
                System.out.println("Ingrese la menor altura sobre el nivel del mar! ");
                menorAltura[identificador] = datosEntrada.nextInt();
                System.out.println("Ingrese la mayor altura sobre el nivel del mar! ");
                mayorAltura[identificador] = datosEntrada.nextInt();
                System.out.println("Los datos se han guardado correctamente!");
            //Se le mostrara el arreglo de los departamentos.
            }else if(loginOption == 6){
                for(int i = 0; i < departamentos.length; i++){
                    System.out.println("ID: " + i + " - " + "Departamento: "+departamentos[i]);
                }
            //Pedira la ID del departamento y mostrara su respectiva informacion
            }else if(loginOption == 7){
                System.out.println("Ingrese el nombre del departamento: ");
                String nombreDepartamento = teclado.nextLine();
                // System.out.print("Ingrese el ID del departamento");
                // int identificador = datosEntrada.nextInt();
                int acumuladorHabitantes = 0;
                System.out.println("Nombre del departamento: " + nombreDepartamento);
                System.out.println("Municipios: ");
                for(int i = 0; i < departamentos.length; i++){
                    if(nombreDepartamento.equalsIgnoreCase(departamentos[i])){
                        System.out.println(municipios[i]);
                        System.out.println("Altura mayor sobre el nivel del mar de " + municipios[i] + ": " + mayorAltura[i]);
                        System.out.println("Altura menor sobre el nivel del mar de " + municipios[i] + ": " + menorAltura[i]);
                        acumuladorHabitantes = acumuladorHabitantes+cantidadHabitantes[i];
                    }
                }
                System.out.println("Total habitantes del departamento: "+acumuladorHabitantes);
            //opcion 8
            }else if(loginOption == 8){
                //pedimos el ID del municipio
                System.out.println("Ingrese el ID del municipio que desea eliminar ");
                int identificador = datosEntrada.nextInt();
                for(int i = identificador; i < municipios.length-1; i++){
                    //ya teniendo el ID procedemos a mover un espacio a la izquierda todos los datos con el fin de eliminar
                    //los de la posicion indicada
                    municipios[i] = municipios[i+1];
                    cantidadHabitantes[i] = cantidadHabitantes[i+1];
                    mayorAltura[i] = mayorAltura[i+1];
                    menorAltura[i] = menorAltura[i+1];
                    departamentos[i] = departamentos[i+1];
                }
                //aumentamos memoria y disminuimos iterador.
                availableMemory++;
                iterador--;
                System.out.println("El municipio ha sido eliminado de la base de datos");
            //opcion 9
            }else if(loginOption == 9){
                //pedimos el nombre del departamento        
                System.out.println("Ingrese el nombre del departamento que desea eliminar ");
                String departamentoEliminar = teclado.nextLine();
                for(int i = 0; i < departamentos.length; i++){
                    //recorremos el arreglo con el fin de comparar cada posicion con la palabra ingresada.
                    if(departamentoEliminar.equalsIgnoreCase(departamentos[i])){
                        //al encontrar similitud todos los datos asociados a esa posicion (osea departamento) 
                        //pasan a 0 o nulo (eliminado)
                        departamentos[i] = null;
                        municipios[i] = null;
                        cantidadHabitantes[i] = 0;
                        mayorAltura[i] = 0;
                        menorAltura[i] = 0;

                        //la memoria aumenta y el iterador disminuye
                        availableMemory++;
                        iterador--;
                    }
                }
                //iniciamos un nuevo ciclo
                for(int j = 0; j < departamentos.length-1; j++){
                    //si la posicion recorrida es un resultado nulo (vacio/eliminado) entra en la condicion
                    if(departamentos[j] == null){
                        //iniciamos un iterador con el valor del iterador mas 1.
                        int contador = j + 1;
                        while(contador < departamentos.length){
                            //si el departamento en la posicion contador es diferente a un resultado nulo
                            //entrara en la condicion
                            if(departamentos[contador] != null){
                                //la posicion de j pasa a ser lo de la posicion j+1(contador)
                                departamentos[j] = departamentos[contador];
                                //la posicion de j+1 (contador) pasa a ser nulo (vacio/eliminado)
                                departamentos[contador] = null;
                                municipios[j] = municipios[contador];
                                municipios[contador] = null;
                                cantidadHabitantes[j] = cantidadHabitantes[contador];
                                cantidadHabitantes[contador] = 0;
                                mayorAltura[j] = mayorAltura[contador];
                                mayorAltura[contador] = 0;
                                menorAltura[j] = menorAltura[contador];
                                menorAltura[contador] = 0;
                                break;
                            }else{
                                //en caso de que ya se encuentre un valor nulo el contador aumentara.
                                contador++;
                            }
                        }
                    }
                }
            }
        }while( loginOption < 10);
    }
}