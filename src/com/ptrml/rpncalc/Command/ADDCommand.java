package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class ADDCommand extends Command {

    Double x;
    Double y;

    public ADDCommand(RPNStack stack) {
        super(stack);
    }


    @Override
    public void execute() {

        //get last two and save for undo
        x = stack.pull();
        y = stack.pull();

        System.err.println(x);
        System.err.println(y);

        //push result
        stack.push(x+y);
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
