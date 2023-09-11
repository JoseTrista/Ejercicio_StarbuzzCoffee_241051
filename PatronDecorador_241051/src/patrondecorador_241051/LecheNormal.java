/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 *
 * @author Jose Carlos Trista Rosales
 */
public class LecheNormal extends Condimento{
    
    public LecheNormal(Bebida bebida){
        this.bebida = bebida;
    }
    
    @Override
    public String getDescription(){
        return bebida.getDescription()+", con Leche Normal";
    }
    
    public double costo(){
        double aumento = bebida.costo()+10.00;
        return aumento;
    }
}
