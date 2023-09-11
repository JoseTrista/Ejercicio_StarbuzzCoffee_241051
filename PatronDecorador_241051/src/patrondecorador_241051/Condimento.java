/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 *
 * @author Jose Carlos Trista Rosales
 */
public class Condimento extends Bebida{
    
    public Bebida bebida;
    
   @Override
    public String getDescription() {
       return descripcion;
    }

    @Override
    public double costo() {
        return costo;
    }

}
