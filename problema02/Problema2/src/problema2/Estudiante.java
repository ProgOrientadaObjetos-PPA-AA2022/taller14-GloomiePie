/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
/**
 *
 * @author USUARIO 2020
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    public Estudiante(String nombre, String apellido, 
            double calificacion1, double calificacion2, 
            double calificacion3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerApellido(String a){
        apellido = a;
    }
    public void establecerCalificacion1(double cl1){
        calificacion1 = cl1;
    }
    public void establecerCalificacion2(double cl2){
        calificacion2 = cl2;
    }
    public void establecerCalificacion3(double cl3){
        calificacion3 = cl3;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerApellido() {
        return apellido;
    }
    public double obtenerCalificacion1() {
        return calificacion1;
    }
    public double obtenerCalificacion2() {
        return calificacion2;
    }
    public double obtenerCalificacion3() {
        return calificacion3;
    }
    @Override
    public String toString() {
        String cadenafinal = String.format("\n"
                + "%s "
                + "%s\n"
                +"Calificaciones:\n"
                + "%.2f\n"
                + "%.2f\n"
                + "%.2f\n",
                obtenerNombre(), obtenerApellido(), obtenerCalificacion1(),
                obtenerCalificacion2(), obtenerCalificacion3());
        return cadenafinal;
    }
}
