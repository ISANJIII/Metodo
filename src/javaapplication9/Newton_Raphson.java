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
public class Newton_Raphson {

    public static void main(String[] args) {
        double x0, x1, E;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese x0");
        x0 = sc.nextDouble();
        x1 = x0;
        System.out.println("Ingrese valor del error E: ");
        E = sc.nextDouble();
        while (Math.abs(f(x1)) > E) {
            System.out.println("x0: " + x0);
            System.out.println("f(x0): " + f(x0));
            System.out.println("dF(x0): " + dF(x0));
            x1 = x0 - (f(x0) / dF(x0));
            System.out.println("x1: " + x1);
            x0 = x1;
            System.out.println("________________");
        }
        System.out.println("Raiz aproximada: " + x1+", el valor es f("+x1+")= "+Math.abs(f(x1)));

    }

    //funcion
    public static double f(double valor) {
        return Math.pow(Math.E, -valor) - valor;

    }
    //derivada de la funcion

    public static double dF(double valor) {
        return (-Math.pow(Math.E, -valor)) - 1;

    }

}
