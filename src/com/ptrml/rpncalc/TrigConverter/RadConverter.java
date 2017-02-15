package com.ptrml.rpncalc.TrigConverter;

/**
 * Converts to and from radians
 */
public class RadConverter extends TrigConverter{
    public Double toRad(Double input){
        return input;
    };
    public Double toGrad(Double input){
        return input*63.662;
    };
    public Double toDeg(Double input){
        return Math.toDegrees(input);
    }

    @Override
    public Double fromRad(Double input) {
        return input;
    }

    @Override
    public Double fromGrad(Double input) {
        return input*0.0157;
    }

    @Override
    public Double fromDeg(Double input) {
        return Math.toRadians(input);
    }

    ;
}
