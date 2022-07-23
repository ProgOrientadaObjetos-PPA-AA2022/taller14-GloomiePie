/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author reroes
 */
public class Enlace {
    private Connection conn;
       
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/trabajador.bd";  
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
    
    public void insertarAuto(Trabajador auto) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajador (cedula,"
                    + "nombres, correo, sueldo, mesSueldo) "
                    + "values ('%s', '%s', %s, %.2f, %.2f)", 
                    auto.obtenerCedula(), 
                    auto.obtenerNombres(),
                    auto.obtenerCorreo(),
                    auto.obtenerSueldo(),
                    auto.obtenerMesSueldo());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception:");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public ArrayList<Trabajador> obtenerDataAuto() {  
        ArrayList<Trabajador> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from trabajador;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Trabajador auto = new Trabajador();
                auto.establecerCedula(rs.getString("cedula"));
                auto.establecerNombres(rs.getString("nombres"));
                auto.establecerCorreo(rs.getString("correo"));
                auto.establecerSueldo(rs.getDouble("sueldo"));
                auto.calcularMesSueldo(rs.getDouble("mesSueldo"));
                lista.add(auto);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarCedula");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }
     
}
