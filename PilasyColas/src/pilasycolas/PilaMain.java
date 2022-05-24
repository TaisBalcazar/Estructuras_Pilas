/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasycolas;

/**
 *
 * @author SALA H
 */
public class PilaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clasePilaArray pila;
        pila = new clasePilaArray(4);

        pila.InsertarPila();
        pila.InsertarPila();
        pila.EliminarPila();
        pila.MostrarPila();

    }

}
