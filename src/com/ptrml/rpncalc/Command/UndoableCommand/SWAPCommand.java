package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class SWAPCommand extends UndoableCommand {
    public SWAPCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        Double x = core.getStack().pull();
        Double y = core.getStack().pull();

        core.getStack().push(x);
        core.getStack().push(y);
    }


}
