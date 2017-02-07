package com.ptrml.rpncalc;

/**
 * Created by ptrml on 1/5/2017.
 */
public class RPNStack {

    private Double t = 0.0;
    private Double z = 0.0;
    private Double y = 0.0;
    private Double x = 0.0;



    public Double pull(){
        this.x=this.y;
        this.y=this.z;
        this.z=this.t;
        return this.x;
    };
    public Double push(double input){
        this.t=this.z;
        this.z=this.y;
        this.y=this.x;
        this.x = input;
        return this.x;
    };


    public Double[] getCurrentStack(){
        return new Double[]{this.x, this.y, this.t, this.z};
    };

}
