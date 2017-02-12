package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class STONumCommand extends SpecialCommand {
    Character input;
    public STONumCommand(RPNCore core, Character input) {
        super(core);
        this.input = input;
    }

    @Override
    public void executable() {
        Integer slot = (Integer.parseInt(input.toString()));

        if(core.getDisplay().isEmpty())
            core.getMemorySlotManager().setMemory_slot(slot,(core.getStack().getCurrentStack())[0]);
        else
            core.getMemorySlotManager().setMemory_slot(slot,Double.parseDouble(core.getDisplay().getValue()));





        core.setState(CharLegend.getInstance().STATE_NORMAL);



    }


}
