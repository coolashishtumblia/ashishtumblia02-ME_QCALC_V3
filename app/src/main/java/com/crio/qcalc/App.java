/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        StandardCalculator cal=new StandardCalculator();
        System.out.println("Standard Calculator");
        cal.add(1,1);
        cal.printResult();
        cal.subtract(1,1);
        cal.printResult();
        cal.multiply(2,2);
        cal.printResult();
        cal.divide(4,2);
        cal.printResult();
        cal.printResult();
        System.out.println("-------------------------------");
        System.out.println("Scientific Calculator");
       ScientificCalculator calc=new ScientificCalculator();
       double result;
       int res;
       result=calc.squareOf(5);
       System.out.println(result);
       result=calc.cubeOf(3);
       System.out.println(result);
       result=calc.powerOf(2,3);
       System.out.println(result);
       result=calc.squareRoot(25);
       System.out.println(result);
       res=calc.modulo(10, 2);
       System.out.println(res);
       res=calc.modulo_double(23, 2);
       System.out.println(res);
    }
}
