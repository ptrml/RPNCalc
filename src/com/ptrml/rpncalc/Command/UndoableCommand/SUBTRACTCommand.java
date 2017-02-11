package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class SUBTRACTCommand extends UndoableCommand {

    Double x;
    Double y;

    public SUBTRACTCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {

        //get last two and save for undo
        x = core.getStack().pull();
        y = core.getStack().pull();

        //push result
        core.getStack().push(y-x);
    }


}
