/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        ArrayList<Trabajador> lista;
        sc.useLocale(Locale.US);
        boolean bandera = true;
        Enlace c = new Enlace();
        
            while (bandera) {
                
                
                System.out.println("Ingrese la cedula: ");
                String cedula = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el correo: ");
                String correo = sc.nextLine();
                System.out.println("Ingrese el sueldo: ");
                double sueld = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese el mes del sueldo: ");
                String mesSueldo = sc.nextLine();
                Trabajador t1 = new Trabajador(cedula,nombre,correo,sueld,mesSueldo);
                
                c.insertarTrabajador(t1);
                
                System.out.println("Para salir pulse el numero X ");
                String salir = sc.nextLine().toUpperCase();
                if (salir == "X") {
                    bandera = false;
                }
                sc.nextLine();
                
            }
        

    }
}
