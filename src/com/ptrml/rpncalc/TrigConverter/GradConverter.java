package com.ptrml.rpncalc.TrigConverter;

/**
 * Converts to and from gradians
 */
public class GradConverter extends TrigConverter{
    public Double toRad(Double input){
        return input*0.0157;
    };
    public Double toGrad(Double input){
        return input;
    };
    public Double toDeg(Double input){
        return Math.toDegrees(this.toRad(input));
    }

    @Override
    public Double fromRad(Double input) {
        return input*63.662;
    }

    @Override
    public Double fromGrad(Double input) {
        return input;
    }

    @Override
    public Double fromDeg(Double input) {
        return this.fromRad(Math.toRadians(input));
    }

    ;
}
