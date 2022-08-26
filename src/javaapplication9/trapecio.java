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
  double a, b , n, h;
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
  return Math.tan(valor);

 }

 public static double formula(double a, double b, double h, double n) {
  double retornar = 0, val;
  //guardo el valor de f(a)  osea x0
  val = f(a);
  // le sumo a+ el h
  a = a + h;
  //solo iterno x1..xn-1
  for (int i = 1; i < n; i++) {
   retornar = f(a) + retornar;
   a = a + h;

  }
  //le sumo f(b) osea xn
  return ((retornar * 2) + val + f(b)) * (h / 2);
 }

}
