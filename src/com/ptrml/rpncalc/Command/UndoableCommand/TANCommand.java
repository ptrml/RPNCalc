package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class TANCommand extends UndoableCommand {
    public TANCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() throws Exception {
        Double x = core.getStack().pull();
        Double calculated;

        if(core.getMode()== CharLegend.MODE_DEG)
            calculated = Math.tan(Math.toRadians(x));
        else if (core.getMode()== CharLegend.MODE_GRAD)
            calculated = Math.tan(Math.PI * x / 200);
        else if (core.getMode()== CharLegend.MODE_RAD)
            calculated = Math.tan((x));
        else
            throw new Exception("Unknown trig mode");


        core.getStack().push(calculated);

    }


}