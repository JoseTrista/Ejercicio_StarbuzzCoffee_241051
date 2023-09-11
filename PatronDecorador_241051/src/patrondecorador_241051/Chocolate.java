/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 * La clase Chocolate es un decorador concreto que agrega la opción de chocolate a una bebida.
 * Extiende la clase Condimento, que es parte del patrón decorador.
 * 
 * @author Jose Carlos Trista Rosales
 */
public class Chocolate extends Condimento{
    
   /**
     * Constructor de Chocolate.
     * 
     * @param bebida La bebida a la que se le agregará chocolate.
     */
    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }

    /**
     * Obtiene la descripción de la bebida con la adición de chocolate.
     * 
     * @return La descripción de la bebida con chocolate.
     */
    @Override
    public String getDescription() {
        return bebida.getDescription() + ", con Chocolate";
    }

    /**
     * Calcula el costo total de la bebida con la adición de chocolate.
     * 
     * @return El costo total de la bebida con chocolate.
     */
    @Override
    public double costo() {
        // Se agrega un costo adicional de 4.00 unidades monetarias por el chocolate.
        double aumento = bebida.costo() + 4.00;
        return aumento;
    }
}
