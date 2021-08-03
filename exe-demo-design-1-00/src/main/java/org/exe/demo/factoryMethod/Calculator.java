package org.exe.demo.factoryMethod;



import org.exe.demo.simplefac.OperationFactory;

import java.util.Scanner;

/**
 * @Description: for client
 * @Author RileyShen
 * @Create 2021-08-01
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter number A");
        double numberA = sc.nextDouble();

        System.out.println("please enter operator +-*/");
        String oper = sc.next();

        System.out.println("please enter number B");
        double numberB = sc.nextDouble();

        IFactory factory = new AddFactory();

        Operation res = factory.createOper();

        System.out.println(res);

    }
}
