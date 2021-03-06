package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class DRGCommand extends SpecialCommand {

    public DRGCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        if(core.getTrigMode()==CharLegend.getInstance().MODE_DEG)
            core.setTrigMode(CharLegend.getInstance().MODE_RAD);

        else if(core.getTrigMode()==CharLegend.getInstance().MODE_RAD)
            core.setTrigMode(CharLegend.getInstance().MODE_GRAD);

        else if(core.getTrigMode()==CharLegend.getInstance().MODE_GRAD)
            core.setTrigMode(CharLegend.getInstance().MODE_DEG);
    }

}
