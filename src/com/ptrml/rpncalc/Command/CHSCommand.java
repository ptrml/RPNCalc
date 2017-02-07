package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class CHSCommand extends Command {
    public CHSCommand(RPNStack stack) {
        super(stack);
    }

    @Override
    public void execute() {
        Double x = stack.pull();
        x*=-1;
        stack.push(x);
    }

    @Override
    public void undo() {
        Double x = stack.pull();
        x*=-1;
        stack.push(x);
    }
}
