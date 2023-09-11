/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 *
 * @author Jose Carlos Trista Rosales
 */
public class CremaBatida extends Condimento{
    
    public CremaBatida(Bebida bebida){
        this.bebida = bebida;
    }
    
    @Override
    public String getDescription(){
        return bebida.getDescription()+", con Crema Batida";
    }
    
    public double costo(){
        double aumento = bebida.costo()+20.00;
        return aumento;
    }
}
