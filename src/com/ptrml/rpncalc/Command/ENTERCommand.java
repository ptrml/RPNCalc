package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class ENTERCommand extends Command {
    Double x;

    public ENTERCommand(RPNStack stack,Double input) {
        super(stack);
        x = input;
    }



    @Override
    public void execute() {
        stack.push(x);
    }


    @Override
    public void undo() {
        stack.pull();
    }
}
