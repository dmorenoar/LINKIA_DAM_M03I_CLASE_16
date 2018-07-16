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
public class Hijo extends Padre {

    private int lvlPokemon;

    public Hijo(String nombre, int edad, int lvlPokemon) {
        super(nombre, edad);
        this.lvlPokemon = lvlPokemon;
        this.setSueldo(400);
    }

    public Hijo(String nombre, int edad) {
        super(nombre, edad);
    }

    //Siempre que queramos hacer una sobreescritura de un método en Java hemos de poner los
    //mismo parámetros y el mismo retorno porque si no no lo considera sobreescritura.
    
    //Sobreescritura o redefinición o Override -> Modificar la funcionalidad del método
    //Sobrecarga -> Modificar los parámetros o retorno del método pero con el mismo nombre
    
    @Override 
    public String jugarFutbol() {
        return "Juego a futbol desde la clase hijo";
    }

    public void jugarVideojuego() {
        System.out.println("Ahora juego al ....");
    }

    @Override
    public void setSueldo(int sueldo) {
        if(sueldo < 800 ){
            System.out.println("Por debajo del Salario mínimo");
        }else{
            
            /*Realizar una llamada al padre para utilizar un método o acceder a un atributo*/
            /*Utilizando el super. hacemos lo mismo que si creasemos una instancia del padre*/
            Padre p = new Padre("Tomas",54);
            p.getNombre();
            
            super.getNombre();
        }
    }

    
    
}
