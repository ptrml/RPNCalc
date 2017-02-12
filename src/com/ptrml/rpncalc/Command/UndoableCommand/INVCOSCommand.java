package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class INVCOSCommand extends UndoableCommand {
    public INVCOSCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() throws Exception {
        Double x = core.getStack().pull();
        Double calculated;

        if(core.getTrigMode()== CharLegend.getInstance().MODE_DEG)
            calculated = Math.toDegrees(Math.acos((x)));
        else if (core.getTrigMode()== CharLegend.getInstance().MODE_GRAD)
            calculated = Math.acos(x) * 63.663;
        else if (core.getTrigMode()== CharLegend.getInstance().MODE_RAD)
            calculated = Math.acos((x));
        else
            throw new Exception("Unknown trig mode");


        core.getStack().push(calculated);

    }

}
