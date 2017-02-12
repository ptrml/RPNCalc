package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RCLNumCommand extends UndoableCommand {
    Character input;
    public RCLNumCommand(RPNCore core,Character input) {
        super(core);
        this.input = input;
    }

    @Override
    public void executable() {
        Double reclaimed = core.getMemorySlotManager().getMemory_slot(Integer.parseInt(input.toString()));
        core.getNumComposer().setNormalValue("");
        core.getStack().push(reclaimed);
    }


}
