/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import problema2.Estudiante;

/**
 *
 * @author USUARIO 2020
 */
public class Enlace {
     private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.bd";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarEstudiante(Estudiante estudiante) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO estudiante (nombre,"
                    + "apellido, califiacion1, califiacion2, califiacion3)"
                    + "values ('%s', '%s', '%.2f', '%.2f', '%.2f')", estudiante.obtenerNombre(),
                    estudiante.obtenerApellido(), estudiante.obtenerCalificacion1(), 
                    estudiante.obtenerCalificacion2(), estudiante.obtenerCalificacion3());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Estudiante> obtenerDataEstudiante() {  
        ArrayList<Estudiante> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from estudiante;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Estudiante miEstudiante = new Estudiante(rs.getString("nombre"),
                rs.getString("apellido"), rs.getDouble("calificacion1"), 
                rs.getDouble("calificacion2"), rs.getDouble("calificacion3"));
                lista.add(miEstudiante);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarCiudad");
             System.out.println(e.getMessage());   
        }  
        return lista;
    }
}
