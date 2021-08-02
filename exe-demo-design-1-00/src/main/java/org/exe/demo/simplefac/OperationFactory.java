package org.exe.demo.simplefac;



import java.util.Scanner;

/**
 * @Description:
 *
 * Factory: produce the products, static method
 *
 * @Author RileyShen
 * @Create 2021-07-31
 */
public class OperationFactory {

    public  static Operation createOper(String operate) {

        switch (operate) {
            case "+":
                return new OperationAdd();

            case "-":
                return  new OperationMin();
            // case "*"
            default:
                throw new RuntimeException(".......");
        }
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



