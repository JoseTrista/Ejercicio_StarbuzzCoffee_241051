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
 *
 * @author Jose Carlos Trista Rosales
 */
public class Clase_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bebida bebida = new HouseBlend();
        bebida = new CremaBatida(bebida);
        System.out.println(bebida.getDescription() + " $" + bebida.costo());
 
        Bebida bebida2 = new DarkRoast();
        bebida2 = new CremaBatida(bebida2);
        bebida2 = new Chocolate(bebida2);
        System.out.println(bebida2.getDescription() + " $" + bebida2.costo());
        
        Bebida bebida3 = new Expresso();
        bebida3 = new CremaBatida(bebida3);
        bebida3 = new LecheNormal(bebida3);
        System.out.println(bebida3.getDescription() + " $" + bebida3.costo());
        
        Bebida bebida4 = new Descafeinado();
        bebida4 = new Chocolate(bebida4);
        bebida4 = new LecheSoya(bebida4);
        System.out.println(bebida4.getDescription() + " $" + bebida4.costo());
    }
    
}
