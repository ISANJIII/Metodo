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
public class trapecio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, n, h;
        System.out.println("ingrese a: ");
        a = sc.nextDouble();
        System.out.println("ingrese b: ");
        b = sc.nextDouble();
        System.out.println("ingrese n: ");
        n = sc.nextDouble();
        h = (b - a) / n;

        System.out.println("el h es: " + h);

        System.out.println("valor aproximado es: " + formula(a, b, h, n));

    }

    //formula
    public static double f(double valor) {
        return Math.sin(valor);

    }

    public static double formula(double a, double b, double h, double n) {
        double retornar = 0,val;
        val=f(a);
        System.out.println(f(a));
        System.out.println(f(b));
        a=a+h;
        for (int i = 1; i < n; i++) {
            //par

       
            System.out.println(" de  "+f(a));
            retornar=f(a)+retornar;
            a = a + h;

        }
return ((retornar*2)+val+f(b))*(h/2);
    }

}
