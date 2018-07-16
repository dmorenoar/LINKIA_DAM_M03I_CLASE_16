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
public class Padre {
    private String nombre;
    private int edad;
    private int sueldo;
    
    public Padre(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setSueldo(int sueldo){
        if(sueldo < 500 ){
            System.out.println("Por debajo del Salario mínimo");
        }else{
            this.sueldo = sueldo;
        }
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String jugarFutbol(){
        return "Juego a futbol en la clase padre";
    }
 
    public void calcularChute(){
        System.out.println("Fuerza de chute 10");
    }
    
}
