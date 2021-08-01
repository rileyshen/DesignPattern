package org.exe.demo.simplefac;

import org.junit.jupiter.api.Test;

/**
 * @Description: for client
 * @Author RileyShen
 * @Create 2021-08-01
 */
public class Calculator {
    public static void main(String[] args) {

            Operation oper;

            oper = OperationFactory.createOper("+");
            oper.NumberA() = 1;
            double numberB = oper.getNumberB();
            numberB = 2;
        }
    }
}
