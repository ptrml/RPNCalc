package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class CHSCommand extends UndoableCommand implements EnterableCommand {
    public CHSCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {

        if(core.getNumComposer().isEmpty())
        {
            Double x = core.getStack().pull();
            x*=-1;
            core.getStack().push(x);
        }
        else
        {
            core.getNumComposer().setValue("-"+(core.getNumComposer().getValue()));
        }

    }

}
