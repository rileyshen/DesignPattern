package org.exe.demo.simplefac;

/**
 * @Description:
 * @Author RileyShen
 * @Create 2021-08-01
 */
public class OperationAdd extends Operation{
    @Override
    public double getRes() throws Exception {
        double res = 0;
        res = getNumberA() + getNumberB();
        return res;
    }
}
