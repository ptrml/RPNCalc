package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class DROPCommand extends UndoableCommand {
    private Double x;

    public DROPCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        x = this.core.getStack().pull();
    }

}
