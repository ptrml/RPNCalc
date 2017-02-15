package com.ptrml.rpncalc.TrigConverter;

/**
 * Converts to and from degrees
 */
public class DegConverter extends TrigConverter{
    public Double toRad(Double input){
        return Math.toRadians(input);
    };
    public Double toGrad(Double input){
        return this.toRad(input)*63.662;
    };
    public Double toDeg(Double input){
        return input;
    }

    @Override
    public Double fromRad(Double input) {
        return Math.toDegrees(input);
    }

    @Override
    public Double fromGrad(Double input) {
        return Math.toDegrees(input*0.0157);
    }

    @Override
    public Double fromDeg(Double input) {
        return input;
    }

    ;
}
