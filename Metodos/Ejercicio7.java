import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[]args){

        Scanner datosEntrada = new Scanner(System.in);

        boolean validation = true;
        int mayusculas = 0;
        int minusculas = 0;
        int numerico = 0;
        int caracter = 0;
        int passwordLength = 0;
        String password = "";
        char espacio = 32;
        int espacios = 0;
        char ene = 0;

       do{
            System.out.println("Ingrese la contrasena");
            System.out.println("La contraseña debe ser de minimo 8 digitos");
            password = datosEntrada.nextLine();
            passwordLength = password.length();
       }while(passwordLength < 8);

       for(int i = 0; i < passwordLength; i++){
            if(password.charAt(i) >= 65 && password.charAt(i) <= 90){
                mayusculas++;
            }else if(password.charAt(i) >= 97 && password.charAt(i) <= 122){
                minusculas++;
            }else if(password.charAt(i) == ' '){
                espacios++;
            }else if(password.charAt(i) >= 0){
                numerico++;
            }else if(password.charAt(i) == 164){
                minusculas++;
            }else if(password.charAt(i) == 165){
                mayusculas++;
            }else if(password.charAt(i) == 45 ||password.charAt(i) == 46 ||password.charAt(i) == 42 ||
                password.charAt(i) == 123||password.charAt(i) == 123||password.charAt(i) == 40 ||
                password.charAt(i) == 41 ||password.charAt(i) == 35 ||password.charAt(i) == 36 ||
                password.charAt(i) == 37 ||password.charAt(i) == 47 ||password.charAt(i) == 63 ||
                password.charAt(i) == 33 ||password.charAt(i) == 63 ||password.charAt(i) == 173||
                password.charAt(i) == 33); 
       }  

       if(mayusculas >= 1 && minusculas >= 1 && espacios == 0 && numerico >= 1){
        System.out.println("Su contrasena " + password + " es valida");
       }else{
        System.out.println("Su contrasena " + password + " NO es valida");
       }  
    }
}