package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class CHSCommand extends UndoableCommand {
    public CHSCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        Double x = core.getStack().pull();
        x*=-1;
        core.getStack().push(x);
    }

}
