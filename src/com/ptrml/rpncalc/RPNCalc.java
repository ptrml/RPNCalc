package com.ptrml.rpncalc;


import com.ptrml.rpncalc.Operator.OperatorFactory;

/**
 * Created by ptrml on 1/5/2017.
 */
public class RPNCalc {

    //TODO RADS/DEG


    private RPNStack stack;
    private RPNCore core;

    private String current = "";

    public RPNCalc() {
        stack = new RPNStack();
        core = new RPNCore(stack);
    }

    public void input(Character input) throws Exception {
        if(this.isDigit(input))
            this.onDigit(input);
        //else if(this.isOperator(input))
        //    this.onOperation(input);
        else
            this.onCommand(input);

    };



    private void onDigit(Character input){
        this.current.concat(input.toString());
    };

    private void onENTER(){
        core.ENTER(Double.parseDouble(this.current));
    };

    private void onADD(){
        core.ADD();
    };
    private void onDIVIDE(){
        core.DIVIDE();
    };
    private void onMULTIPLY(){
        core.MULTIPLY();
    };
    private void onSUBTRACT(){
        core.SUBTRACT();
    };
    private void onCHS(){
        core.CHS();
    };
    private void onDROP(){
        core.DROP();
    };
    private void onSWAP(){
        core.SWAP();
    };
    private void onUNDO(){
        core.UNDO();
    };
    private void onREDO(){
        core.REDO();
    };
    private void onSTO(Integer position, Double num){
        core.STO(position, num);
    };
    private void onRCL(Integer position){
        core.RCL(position);
    };
    private void onPROG(){
        core.PROG();
    };
    private void onEXE(){
        core.EXE();
    };



    private void onCommand(Character input)
    {
        //return input.equals(ENTER);
    }





    private Boolean isOperator(Character input)
    {
        return OperatorFactory.isOperator(input);
    }

    private Boolean isDigit(Character input)
    {
        return (input >= '0' && input <= '9') || input == '.';
    }



    public Double[] getStack()
    {
        return stack.getCurrentStack();
    }

    public String getCurrent() {
        return current;
    }
}

