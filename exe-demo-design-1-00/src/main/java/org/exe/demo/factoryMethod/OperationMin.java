package org.exe.demo.factoryMethod;

/**
 * @Description:
 *
 *
 * produce
 *
 * @Author RileyShen
 * @Create 2021-08-01
 */

public class OperationMin implements Operation {
    @Override
    public double getRes(double numberA, double numberB) {
        return numberA - numberB;
    }
}
