package com.ptrml.rpncalc.Operator;

/**
 * Created by ptrml on 12/1/2016.
 */
public class Divider extends Operator {
    @Override
    public double execute(double var1, double var2) {
        return var1/var2;
    }
}
