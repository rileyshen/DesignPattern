package org.exe.demo.simplefac;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @Description:
 *
 * @Author RileyShen
 * @Create 2021-07-31
 */
public class OperationFactory {

    public static Operation createOper(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;

        }
        return oper;
    }

}

//        Scanner sc = new Scanner(System.in);
//
//            System.out.println("Please enter number A: ");
//            double douA = sc.nextDouble();
//
//        System.out.println("Please choose + , -, *, / ");
//        String strOper = sc.next();
//
//        System.out.println("Please enter number B: ");
//        double douB = sc.nextDouble();
//
//        double res = 0d;
//        res = Operation.getResult(douA, douB, strOper);
//
//        System.out.println(res);


