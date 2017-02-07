package com.ptrml.rpncalc.Operator;

/**
 * Created by ptrml on 12/14/2016.
 */
public class OperatorFactory {
    /**
     * @param c karakter na operatorot
     * @return Operator
     * @throws Exception ako karakterot ne e validen operator
     */
    public static Operator getOperator(Character c) throws Exception {
        switch (c)
        {
            case '+':
                return new Adder();
            case '-':
                return new Subtractor();
            case '*':
                return new Multiplier();
            case '/':
                return new Divider();
            default:
                throw new Exception("No such operator!");

        }
    }

    public static Boolean isOperator(Character c) {

        switch (c)
        {
            case '+':
                return true;
            case '-':
                return true;
            case '*':
                return true;
            case '/':
                return true;
            default:
                return false;

        }
    }
}
