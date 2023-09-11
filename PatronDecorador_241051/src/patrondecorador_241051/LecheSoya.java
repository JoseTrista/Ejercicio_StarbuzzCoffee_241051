/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 * La clase LecheSoya representa un condimento con leche de soya que se puede agregar a una bebida.
 * Extiende la clase Condimento y se utiliza para decorar otras bebidas.
 * 
 * @author Jose Carlos Trista Rosales
 */
public class LecheSoya extends Condimento{
    
    /**
     * Constructor que crea un nuevo objeto LecheSoya para decorar una bebida existente.
     * 
     * @param bebida La bebida a la que se le agregará leche de soya.
     */
    public LecheSoya(Bebida bebida) {
        this.bebida = bebida;
    }

    /**
     * Obtiene la descripción de la bebida decorada con leche de soya.
     * 
     * @return La descripción de la bebida con leche de soya.
     */
    @Override
    public String getDescription() {
        return bebida.getDescription() + ", con Leche de Soya";
    }

    /**
     * Calcula el costo total de la bebida decorada con leche de soya.
     * El costo de la leche de soya se agrega al costo de la bebida base.
     * 
     * @return El costo total de la bebida con leche de soya.
     */
    public double costo() {
        // Se agrega un costo adicional de 20.00 al costo de la bebida base.
        double aumento = bebida.costo() + 20.00;
        return aumento;
    } 
}
