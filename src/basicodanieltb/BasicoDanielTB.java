/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicodanieltb;

/**
 *
 * @author ALU1J
 */
public class BasicoDanielTB {

    /**
     * @param args the command line arguments
     */
    public static void cadenas() {
        String cadena = "Ejemplo de un String.";

        System.out.println(cadena);
    }

    public static void numeros() {
        byte b = 1;
        short s = 30;
        int e = 100;
        long l = 1234;
        float f = 23424234;
        double d = 3.54;

        System.err.println("Valor byte:" + b);
        System.err.println("Valor short:" + s);
        System.err.println("Valor int:" + e);
        System.err.println("Valor long:" + l);
        System.err.println("Valor float:" + f);
        System.out.println("Valor double:" + d);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        numeros();
        cadenas();
    }

}
