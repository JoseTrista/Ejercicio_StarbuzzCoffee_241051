/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 * Esta clase representa un condimento que se puede agregar a una bebida.
 * Un condimento es un decorador en el patrón de diseño Decorador.
 * Extiende la clase Bebida y agrega funcionalidad adicional a una bebida existente.
 * 
 * @author Jose Carlos Trista Rosales
 */
public class Condimento extends Bebida{
   /**
     * La bebida a la que se le agregará este condimento.
     */
    public Bebida bebida;

    /**
     * Obtiene la descripción de la bebida con el condimento.
     * 
     * @return La descripción de la bebida con el condimento.
     */
    @Override
    public String getDescription() {
        return descripcion;
    }

    /**
     * Calcula el costo total de la bebida con el condimento.
     * 
     * @return El costo total de la bebida con el condimento.
     */
    @Override
    public double costo() {
        return costo;
    }
}
