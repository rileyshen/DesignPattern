package org.exe.demo.factoryMethod;

/**
 * @Description:
 *
 * produce
 *
 * @Author RileyShen
 * @Create 2021-08-01
 */
//public class OperationAdd extends Operation{
//    @Override
//    public double getRes() throws Exception {
//       return numberA + numberB;
//    }
//}

public class OperationAdd implements Operation {


    @Override
    public double getRes(double numberA, double numberB) {
        return numberA + numberB;
    }
}
