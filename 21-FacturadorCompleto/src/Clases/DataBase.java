 
package Clases;

import java.sql.*;

public class DataBase {
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "app_java";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        System.out.println("asdasdasd");
        try{
            Connection conexion = DriverManager.getConnection(url, database_user, database_password);
            this.manipularDB = conexion.createStatement();
        }catch(SQLException e){
            System.out.println("Error en conexión: " + e.getMessage());
            this.manipularDB = null;
        }
    }
    
    public ResultSet listaPersonas(){
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM personas");
            registros.next();
            return registros;
        }catch(SQLException e){
            System.out.println("ERROR en SELECT: " + e.getMessage());
            return null;
        }
    }
    
    public boolean insertarPersona(String cedula, String nombres, String apellidos, String telefono, String direccion , String email){
        String consulta = "INSERT INTO personas (cedula, nombres, apellidos, telefono, direccion, email) values ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"')";
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if(respuesta > 0){
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: " + e.getMessage());
            return false;
        }
    }
}
