package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RCLCommand extends SpecialCommand {

    public RCLCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        if(core.getState() != CharLegend.getInstance().STATE_RCL)
            core.setState(CharLegend.getInstance().STATE_RCL);
        else
            core.setState(CharLegend.getInstance().STATE_NORMAL);
    }

}
