package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class DROPCommand extends Command {
    private Double x;

    public DROPCommand(RPNStack stack) {
        super(stack);
    }

    @Override
    public void execute() {
        x = this.stack.pull();
    }

    @Override
    public void undo() {
        this.stack.push(x);
    }
}
