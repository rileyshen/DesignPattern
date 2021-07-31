package org.exe.demo.simplefac;

/**
 * @Description: simplefactory
 * version1.0
 * design a calculator
 *
 * @Author RileyShen
 * @Create 2021-07-31
 */
public class Operation {
    public static double getResult (double numberA, double numberB, String operate) {

        double res = 0d;
        switch (operate) {
            case "+" :
                res = numberA + numberB;
                break;
            case "-":
                res = numberA - numberB;
                break;
            case "*" :
                res = numberA * numberB;
                break;
            case "/":
                res = numberA / numberB;
                break;
        }
        return res;
    }
}

