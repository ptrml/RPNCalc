package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class ASINCommand extends Command {
    public ASINCommand(RPNStack stack) {
        super(stack);
    }

    @Override
    public void execute() {
        Double x = stack.pull();
        stack.push(Math.asin(x));

    }

    @Override
    public void undo() {
        Double x = stack.pull();
        stack.push(Math.sin(x));
    }
}
