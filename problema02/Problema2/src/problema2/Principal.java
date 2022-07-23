/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import problema2.OperacionEstudiante;
import problema2.Enlace;

/**
 *
 * @author USUARIO 2020
 */
public class Principal {
    public static void main(String[] args) {
        Enlace e = new Enlace();
        OperacionEstudiante oe = new OperacionEstudiante(e.obtenerDataEstudiante());
        System.out.println(oe);
    }
    
}
