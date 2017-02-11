package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class INVSINCommand extends UndoableCommand {
    public INVSINCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() throws Exception {
        Double x = core.getStack().pull();
        Double calculated;

        if(core.getMode()== CharLegend.MODE_DEG)
            calculated = Math.toDegrees(Math.asin((x)));
        else if (core.getMode()== CharLegend.MODE_GRAD)
            calculated = Math.asin(x) * 63.663;
        else if (core.getMode()== CharLegend.MODE_RAD)
            calculated = Math.asin((x));
        else
            throw new Exception("Unknown trig mode");


        core.getStack().push(calculated);

        core.setState(CharLegend.STATE_NORMAL);
    }

}
