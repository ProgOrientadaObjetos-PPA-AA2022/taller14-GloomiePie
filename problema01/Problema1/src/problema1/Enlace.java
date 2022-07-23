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
    public void insertarTrabajador(Trabajador lostrabajadores) { 
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajador (Cedula,"
                    + "Nombres, Correo, Sueldo, MesSueldo)"
                    + "values ('%s', '%s', '%s', '%s', '%s')", lostrabajadores.obtenerCedula(),
                    lostrabajadores.obtenerNombres(), lostrabajadores.obtenerCorreo(), 
                    lostrabajadores.obtenerSueldo(), lostrabajadores.obtenerMesSueldo());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
    }
    public ArrayList<Trabajador> obtenerDataTrabajador() {  
        ArrayList<Trabajador> lista = new ArrayList<>();
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Trabajador;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Trabajador trab = new Trabajador(rs.getString("Cedula"),
                rs.getString("Nombre"),rs.getString("Correo"),rs.getDouble("sueldo"),
                        rs.getString("MesSueldo"));
                lista.add(trab);
            }
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarCiudad");
             System.out.println(e.getMessage());  
        }  
        return lista;
    }
}
