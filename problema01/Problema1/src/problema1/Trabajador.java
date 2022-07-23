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
    private String mesSueldo;
    
    public Trabajador(String c, String nom, String co, 
            double s, String mS){
        cedula = c;
        nombres = nom;
        correo = co;
        sueldo = s;
        mesSueldo = mS;
    }
    
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
    public void establecerMesSueldo(String c){
        mesSueldo = c;
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
    public String obtenerMesSueldo(){
        return mesSueldo;
    }
    
    @Override
    public String toString(){
        String data = String.format("Cédula: %s\n"
                + "Nombre: %s\n"
                +"Correro: %s\n"
                +"Sueldo: %.2f\n"
                +"Mes del Sueldo: %s\n", 
                obtenerCedula(), obtenerNombres(),obtenerCorreo(),obtenerSueldo(),
                obtenerMesSueldo());
        return data;
    }
}
