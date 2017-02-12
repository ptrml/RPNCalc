package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class STOCommand extends SpecialCommand {

    public STOCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        if(core.getState() != CharLegend.getInstance().STATE_STO)
            core.setState(CharLegend.getInstance().STATE_STO);
        else
            core.setState(CharLegend.getInstance().STATE_NORMAL);
    }

}
