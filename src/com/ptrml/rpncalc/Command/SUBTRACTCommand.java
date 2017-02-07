package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class SUBTRACTCommand extends Command {

    Double x;
    Double y;

    public SUBTRACTCommand(RPNStack stack) {
        super(stack);
    }

    @Override
    public void execute() {

        //get last two and save for undo
        x = stack.pull();
        y = stack.pull();

        //push result
        stack.push(y-x);
    }

    @Override
    public void undo() {

        //pull rsult and throw away
        stack.pull();

        //push in correct order
        stack.push(y);
        stack.push(x);
    }
}
