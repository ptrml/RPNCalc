package com.ptrml.rpncalc;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Operator.OperatorFactory;

import java.util.List;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RPNCore {
    private RPNStack stack;


    Double[] memory_slots = new Double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};

    List<Command> undoList;
    List<Command> redoList;

    public RPNCore(RPNStack stack) {
        this.stack = stack;
    }



    public void ENTER(Double input){
        stack.push(input);
    };
    public void OPERATION(Character operation) throws Exception {
        Double x = stack.pull();
        Double y = stack.pull();

        Double result = (OperatorFactory.getOperator(operation)).execute(x,y);

        stack.push(result);
    };

    public void ADD() {
    }

    public void DIVIDE() {
    }

    public void MULTIPLY() {
    }

    public void SUBTRACT() {
    }
    public void CHS(){
        Double x = stack.pull();
        x*=-1;
        stack.push(x);
    };
    public void DROP(){
        stack.pull();
    };
    public void SWAP(){
        Double x = stack.pull();
        Double y = stack.pull();

        stack.push(x);
        stack.push(y);
    };
    public void UNDO(){};
    public void REDO(){};
    public void STO(Integer position, Double num){};
    public void RCL(Integer position){};
    public void PROG(){};
    public void EXE(){};


}
