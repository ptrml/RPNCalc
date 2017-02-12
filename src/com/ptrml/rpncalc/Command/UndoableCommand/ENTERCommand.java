package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.Command.SpecialCommand.SpecialCommand;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class ENTERCommand extends UndoableCommand implements EnterableCommand {

    public ENTERCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        String current_str = core.getDisplay().getValue();

        if(current_str.length() == 0)
            current_str = core.getStack().getCurrentStack()[0].toString();


        Double current = Double.parseDouble(current_str);
        core.getDisplay().setVolitileValue(current.toString());
        core.getStack().push(current);
    }
}
