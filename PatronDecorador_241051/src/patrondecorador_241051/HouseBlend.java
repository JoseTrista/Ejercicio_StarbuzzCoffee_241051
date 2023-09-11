/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 * Esta clase representa una bebida llamada "HouseBlend".
 * Extiende la clase abstracta "Bebida" y define sus propiedades específicas.
 * 
 * @author Jose Carlos Trista Rosales
 */
public class HouseBlend extends Bebida{
    
   /**
     * Constructor por defecto de la clase HouseBlend.
     * Inicializa la descripción y el costo de la bebida.
     */ 
   public HouseBlend(){
        super.descripcion ="Cafe House Blend";
        super.costo = 38.00;
    }
    
}
