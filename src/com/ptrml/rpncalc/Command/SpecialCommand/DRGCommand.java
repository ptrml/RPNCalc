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
        if(core.getMode()==CharLegend.MODE_DEG)
            core.setMode(CharLegend.MODE_RAD);

        else if(core.getMode()==CharLegend.MODE_RAD)
            core.setMode(CharLegend.MODE_GRAD);

        else if(core.getMode()==CharLegend.MODE_GRAD)
            core.setMode(CharLegend.MODE_DEG);
    }

}
