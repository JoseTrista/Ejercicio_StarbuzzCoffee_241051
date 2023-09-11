/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrondecorador_241051;

import patrondecorador_241051.Bebida;
import patrondecorador_241051.Chocolate;
import patrondecorador_241051.CremaBatida;
import patrondecorador_241051.DarkRoast;
import patrondecorador_241051.Descafeinado;
import patrondecorador_241051.Expresso;
import patrondecorador_241051.LecheNormal;
import patrondecorador_241051.LecheSoya;

/**
 * Clase principal que demuestra el patrón de decorador con diferentes tipos de bebidas.
 * Permite crear bebidas personalizadas con decoradores para agregar ingredientes.
 * 
 * @author Jose Carlos Trista Rosales
 */
public class Clase_Principal {

   /**
     * Método principal que crea diferentes bebidas y las personaliza con decoradores.
     * Luego imprime la descripción y el costo de cada bebida.
     * 
     * @param args Los argumentos de línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        // Crear una bebida HouseBlend y agregarle CremaBatida
        Bebida bebida = new HouseBlend();
        bebida = new CremaBatida(bebida);
        System.out.println(bebida.getDescription() + " $" + bebida.costo());

        // Crear una bebida DarkRoast, agregarle CremaBatida y Chocolate
        Bebida bebida2 = new DarkRoast();
        bebida2 = new CremaBatida(bebida2);
        bebida2 = new Chocolate(bebida2);
        System.out.println(bebida2.getDescription() + " $" + bebida2.costo());

        // Crear una bebida Expresso, agregarle CremaBatida y LecheNormal
        Bebida bebida3 = new Expresso();
        bebida3 = new CremaBatida(bebida3);
        bebida3 = new LecheNormal(bebida3);
        System.out.println(bebida3.getDescription() + " $" + bebida3.costo());

        // Crear una bebida Descafeinado, agregarle Chocolate y LecheSoya
        Bebida bebida4 = new Descafeinado();
        bebida4 = new Chocolate(bebida4);
        bebida4 = new LecheSoya(bebida4);
        System.out.println(bebida4.getDescription() + " $" + bebida4.costo());
    }
    
}
