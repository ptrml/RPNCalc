package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class SINCommand extends UndoableCommand {
    public SINCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() throws Exception {
        Double x = core.getStack().pull();


        Double calculated;

        if(core.getTrigMode()== CharLegend.MODE_DEG)
            calculated = Math.sin(Math.toRadians(x));
        else if (core.getTrigMode()== CharLegend.MODE_GRAD)
            calculated = Math.sin(Math.PI * x / 200);
        else if (core.getTrigMode()== CharLegend.MODE_RAD)
            calculated = Math.sin((x));
        else
            throw new Exception("Unknown trig mode");


        core.getStack().push(calculated);

    }


}
