/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 * La clase Descafeinado representa una bebida de café descafeinado.
 * Extiende la clase Bebida y establece la descripción y el costo específicos
 * para el café descafeinado.
 * @author Jose Carlos Trista Rosales
 */
public class Descafeinado extends Bebida{
    
    /**
     * Crea una nueva instancia de la clase Descafeinado.
     * Establece la descripción como "Cafe Descafeinado" y el costo como 30.00.
     */ 
    public Descafeinado(){
        super.descripcion ="Cafe Descafeinado";
        super.costo = 30.00;
    }
}
