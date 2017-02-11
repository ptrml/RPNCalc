package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class INVCommand extends SpecialCommand {

    public INVCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        if(core.getState() != CharLegend.STATE_INV)
            core.setState(CharLegend.STATE_INV);
        else
            core.setState(CharLegend.STATE_NORMAL);
    }

}
