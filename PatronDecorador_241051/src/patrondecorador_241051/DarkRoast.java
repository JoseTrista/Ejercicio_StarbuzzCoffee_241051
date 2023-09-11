/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 * Esta clase representa una bebida Dark Roast en un sistema de cafetería.
 * Extiende la clase Bebida y define las propiedades específicas de un Dark Roast.
 * 
 * @author Jose Carlos Trista Rosales
 */
public class DarkRoast extends Bebida{
    
    /**
     * Constructor de DarkRoast. Inicializa la descripción de la bebida y su costo.
     */
    public DarkRoast(){
        super.descripcion ="Cafe Dark Roast";
        super.costo = 45.00;
    }
}
