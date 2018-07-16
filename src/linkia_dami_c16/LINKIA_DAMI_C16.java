/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c16;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_DAMI_C16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Hijo juan = new Hijo("Juan", 35,99);
        
        System.out.println("Juan dime tu edad: " + juan.getEdad());
        System.out.println("A que juegas: " + juan.jugarFutbol());
        
        juan.calcularChute();
        juan.jugarVideojuego();
  
       // System.out.println("Cual es tu sueldo: " + juan.setSueldo(400));
        
    }
    
}
