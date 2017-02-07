package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class SWAPCommand extends Command {
    public SWAPCommand(RPNStack stack) {
        super(stack);
    }

    @Override
    public void execute() {
        Double x = stack.pull();
        Double y = stack.pull();

        stack.push(x);
        stack.push(y);
    }

    @Override
    public void undo() {
        Double x = stack.pull();
        Double y = stack.pull();

        stack.push(x);
        stack.push(y);
    }
}
