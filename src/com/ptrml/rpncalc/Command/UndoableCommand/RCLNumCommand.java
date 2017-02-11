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
        Double reclaimed = core.getMemory_slot(Integer.parseInt(input.toString()));
        core.getDisplay().setNormalValue("");
        core.getStack().push(reclaimed);

        core.setState(CharLegend.STATE_NORMAL);



    }


}
