package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class INVTANCommand extends UndoableCommand {
    public INVTANCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() throws Exception {
        Double x = core.getStack().pull();
        Double calculated;

        if(core.getTrigMode()== CharLegend.MODE_DEG)
            calculated = Math.toDegrees(Math.atan((x)));
        else if (core.getTrigMode()== CharLegend.MODE_GRAD)
            calculated = Math.atan(x) * 63.663;
        else if (core.getTrigMode()== CharLegend.MODE_RAD)
            calculated = Math.atan((x));
        else
            throw new Exception("Unknown trig mode");


        core.getStack().push(calculated);

        core.setState(CharLegend.STATE_NORMAL);
    }

}
