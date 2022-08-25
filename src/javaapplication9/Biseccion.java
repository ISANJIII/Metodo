/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author cristopher.ovaillos
 */
public class Biseccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, e, r=0;
        
       
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a:");
        a = sc.nextDouble();
        System.out.println("Ingrese el valor de b:");
        b = sc.nextDouble();
        System.out.println("Ingrese el valor de e:");
        e = sc.nextDouble();

        if ((f(a) * f(b)) < 0) {
            do {
                r = (a + b) / 2;
                System.out.println(r);
                if (f(a) * f(r) < 0) {
                    b = r;
                } else {
                    a = r;
                }

            } while (Math.abs(f(r)) > e);
        } else {
            System.out.println("No cumple la condicion inicialf(a).f(b)<0");
        }
        System.out.println("La raiz aproximada es:  "+r);

    }

    public static double f(double valor) {
        return 2 * Math.sin(valor + 1);

    }

}
