/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrondecorador_241051;

/**
 * La clase LecheNormal es una extensión de la clase Condimento y 
 * representa un condimento específico que agrega leche normal a una bebida.
 * 
 * @author Jose Carlos Trista Rosales
 */
public class LecheNormal extends Condimento{
    
    /**
     * Constructor de LecheNormal que toma una bebida como parámetro y la asigna a la instancia actual.
     * 
     * @param bebida La bebida a la que se agregará leche normal.
     */
    public LecheNormal(Bebida bebida) {
        this.bebida = bebida;
    }

    /**
     * Obtiene la descripción de la bebida con leche normal agregada.
     * 
     * @return La descripción de la bebida con leche normal.
     */
    @Override
    public String getDescription() {
        return bebida.getDescription() + ", con Leche Normal";
    }

    /**
     * Calcula el costo total de la bebida con leche normal agregada.
     * El costo se calcula sumando el costo de la bebida base y un costo adicional de 10.00 unidades.
     * 
     * @return El costo total de la bebida con leche normal.
     */
    public double costo() {
        double aumento = bebida.costo() + 10.00;
        return aumento;
    }
}
