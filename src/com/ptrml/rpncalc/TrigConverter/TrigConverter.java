package com.ptrml.rpncalc.TrigConverter;

/**
 * Created by ptrml on 2/15/2017.
 */
public abstract class TrigConverter {
    public abstract Double toRad(Double input);
    public abstract Double toGrad(Double input);
    public abstract Double toDeg(Double input);
    public abstract Double fromRad(Double input);
    public abstract Double fromGrad(Double input);
    public abstract Double fromDeg(Double input);
}
