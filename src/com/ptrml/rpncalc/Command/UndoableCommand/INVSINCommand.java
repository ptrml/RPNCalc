package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.TrigConverter.TrigConverter;
import com.ptrml.rpncalc.TrigConverter.TrigFactory;

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
        TrigConverter trigConverter = (TrigFactory.getInstance()).getConverter(core.getTrigMode());


        calculated = trigConverter.fromRad(Math.asin(x));



        core.getStack().push(calculated);

    }

}
