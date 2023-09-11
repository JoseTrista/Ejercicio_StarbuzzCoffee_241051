/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 * La clase Expresso representa una bebida de café tipo Espresso.
 * Extiende la clase Bebida e inicializa la descripción y el costo del Espresso.
 * 
 * @author Jose Carlos Trista Rosales
 */
public class Expresso extends Bebida{
    
     /**
     * Constructor por defecto de la clase Expresso.
     * Inicializa la descripción como "Cafe Expresso" y el costo como 36.00.
     */
    public Expresso(){
        super.descripcion ="Cafe Expresso";
        super.costo = 36.00;
    }
    
    
}
