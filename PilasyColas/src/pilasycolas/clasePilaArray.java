/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasycolas;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class clasePilaArray {

    int[] PILA;
    int TOPE;
    int MAX;

    Scanner teclado = new Scanner(System.in);

    public clasePilaArray(int MAX) {
        this.TOPE = -1;
        this.MAX = MAX;
        this.PILA = new int[this.MAX];
    }

    public int GetTOPE() {
        return TOPE;
    }

    public void VaciarPila() {
        this.TOPE = -1;

    }

    public boolean PilaVacia() {
        if (this.TOPE == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PilaLlena() {
        if (this.MAX - 1 == this.TOPE) {
            return true;
        } else {
            return false;
        }
    }

    public void InsertarPila() {
        if (this.PilaLlena()) {
            System.out.println("Pila llena");
        } else {
            int ITEM;
            System.out.println("Ingrese item a insertar");
            ITEM = teclado.nextInt();
            this.TOPE++;
            this.PILA[this.TOPE] = ITEM;
            System.out.println("El item " + ITEM + " se ha insertado");
        }
    }

    public void EliminarPila() {
        if (this.PilaVacia()) {
            System.out.println("Pila Vacia");
        } else {
            int ITEM = this.PILA[this.TOPE];
            this.TOPE--;
            System.out.println("El item " + ITEM + "se ha eliminado");
        }
    }

    public void MostrarPila() {

        if (this.PilaVacia()) {
            System.out.println("La pila esta vacia\n no hay datos que ");
        } else {
            int i;
            String MOSTRAR = "";

            for (i = 0; i <= this.TOPE; i++) {
                MOSTRAR = MOSTRAR + this.PILA[i] + "\n";
            }
            System.out.println("Los datos de la pila son: \n" + MOSTRAR);
        }

    }
}
