package org.exe.demo.factoryMethod;


/**
 * @Description:
 *
 * Factory: produce the products, static method
 *
 * @Author RileyShen
 * @Create 2021-07-31
 */
public interface IFactory {
    public Operation createOper();
}

class AddFactory implements IFactory {


    @Override
    public Operation createOper() {
        return new OperationAdd();
    }
}


class MinFactory implements IFactory {


    @Override
    public Operation createOper() {
        return new OperationMin();
    }
}


