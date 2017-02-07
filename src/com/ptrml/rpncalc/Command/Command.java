package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
abstract public class Command {

    protected RPNStack stack;

    public Command(RPNStack stack) {
        this.stack = stack;
    }

    abstract public void execute();

    abstract public void undo();
}
