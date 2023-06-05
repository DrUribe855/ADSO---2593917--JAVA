 
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
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: " + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminarPersona(String cedula){
        try{
            String consulta = "DELETE FROM personas WHERE cedula = '"+cedula+"'";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if(resp_consulta > 0){
                return true;
            }else{
                return false;
            }
            
        }catch(SQLException e){
            System.out.println("Error --> Delete: " + e.getMessage());
            return false;
        }
    }
    
    public boolean modificarPersonas(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        try {
            String consulta = "UPDATE personas SET nombres = '"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"' WHERE cedula = '"+cedula+"'";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if(resp_consulta > 0){
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException e) {
            System.out.println("--> Error Update: " + e.getMessage());
            return false;
        }
    }
    
    public ResultSet buscarPersona(String cedula){
        try {
            ResultSet usuario = this.manipularDB.executeQuery("SELECT * FROM personas WHERE cedula = '"+cedula+"'");
            usuario.next();
            return usuario;
        } catch (SQLException e) {
            System.out.println("Error en busqueda: " + e.getMessage());
            return null;
        }
    }
}
