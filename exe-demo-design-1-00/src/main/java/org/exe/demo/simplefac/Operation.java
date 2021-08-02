package org.exe.demo.simplefac;

/**
 * @Description: simplefactory
 *
 * Product:  public interface：
 *
 * // use interface or abstract class:
 *
 * version1.2
 * design a calculator
 *
 * @Author RileyShen
 * @Create 2021-07-31
 */

// use interface or abstract class:

public interface Operation {

//    public double numberA;
//    public double numberB ;


//Interfaces don't contain fields because fields represent a specific implementation of data representation,
// and exposing them would break encapsulation.
// Thus having an interface with a field would effectively be coding to an implementation instead of an interface,
// which is a curious paradox for an interface to have

    public double getRes(double numberA, double numberB);



}

//public abstract class Operation {
//
//    public double numberA ;
//    public double numberB ;
//
//
//    public abstract double getRes() throws Exception;
//}

