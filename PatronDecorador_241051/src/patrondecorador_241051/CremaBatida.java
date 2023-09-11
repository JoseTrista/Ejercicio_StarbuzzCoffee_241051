/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 * Clase que representa la decoración de una bebida con Crema Batida.
 * Extiende la clase Condimento y se utiliza para decorar otras bebidas.
 * 
 * @author Jose Carlos Trista Rosales
 */
public class CremaBatida extends Condimento{
    
    /**
     * Constructor de la clase CremaBatida.
     * 
     * @param bebida La bebida a la que se le agregará Crema Batida.
     */
    public CremaBatida(Bebida bebida) {
        this.bebida = bebida;
    }

    /**
     * Obtiene la descripción de la bebida decorada con Crema Batida.
     * 
     * @return La descripción de la bebida con la adición de Crema Batida.
     */
    @Override
    public String getDescription() {
        return bebida.getDescription() + ", con Crema Batida";
    }

    /**
     * Calcula el costo de la bebida decorada con Crema Batida.
     * 
     * @return El costo total de la bebida con la adición de Crema Batida.
     */
    public double costo() {
        // El costo de la bebida original más el costo adicional de Crema Batida (20.00).
        double aumento = bebida.costo() + 20.00;
        return aumento;
    }
}
