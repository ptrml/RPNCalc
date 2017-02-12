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
        Double result = this.x;

        this.x=this.y;
        this.y=this.z;
        this.z=this.t;
        return result;
    };
    public Double push(double input){
        this.t=this.z;
        this.z=this.y;
        this.y=this.x;
        this.x = input;

        return this.x;
    };


    public Double[] getCurrentStack(){
        return new Double[]{this.x, this.y, this.z, this.t};
    };

    public void flashCurrentStack(Double[] stack)
    {
        this.x = stack[0];
        this.y = stack[1];
        this.z = stack[2];
        this.t = stack[3];
    }

    public void clearStack(){
        t = 0.0;
        z = 0.0;
        y = 0.0;
        x = 0.0;
    }

}
