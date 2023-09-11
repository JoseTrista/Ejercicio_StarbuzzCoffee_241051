/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 *
 * @author Jose Carlos Trista Rosales
 */
public class LecheSoya extends Condimento{
    
    public LecheSoya(Bebida bebida){
        this.bebida = bebida;
    }
    
    @Override
    public String getDescription(){
        return bebida.getDescription()+", con Leche de Soya";
    }
    
    public double costo(){
        double aumento = bebida.costo()+20.00;
        return aumento;
    }
    
    
}
