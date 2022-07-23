/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author SALA I
 */
public class Trabajador {
    
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private double mesSueldo;
    
    public void establecerCedula(String c){
        cedula = c;
    }
    public void establecerNombres(String c){
        nombres = c;
    }
    public void establecerCorreo(String c){
        correo = c;
    }
    public void establecerSueldo(double c){
        sueldo = c;
    }
    public void calcularMesSueldo(){
        mesSueldo = sueldo;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    public String obtenerNombres(){
        return nombres;
    }
    public String obtenerCorreo(){
        return correo;
    }
    public double obtenerSueldo(){
        return sueldo;
    }
    public double obtenerMesSueldo(){
        return mesSueldo;
    }
    
    
}
