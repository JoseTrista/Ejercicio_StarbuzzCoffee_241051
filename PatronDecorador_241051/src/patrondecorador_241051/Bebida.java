/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 * La clase Bebida es la clase base para representar diferentes tipos de bebidas.
 * Puede ser extendida por clases concretas que representen bebidas específicas.
 * 
 * @author Jose Carlos Trista Rosales
 */
public class Bebida {
     /** 
     * Descripción de la bebida.
     */
    String descripcion = "";
    
    /** 
     * Costo de la bebida.
     */
    double costo;
    
    /**
     * Constructor por defecto de la clase Bebida.
     * Crea una nueva instancia de Bebida sin establecer una descripción ni costo inicial.
     */
    public Bebida() {
    }
  
    /**
     * Obtiene la descripción de la bebida.
     * 
     * @return La descripción de la bebida.
     */
    public String getDescription() {
       return descripcion;
    }

    /**
     * Calcula el costo de la bebida.
     * 
     * @return El costo de la bebida.
     */
    public double costo() {
        return costo;
    }
}
