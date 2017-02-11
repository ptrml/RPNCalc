package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.Command.SpecialCommand.SpecialCommand;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class ENTERCommand extends UndoableCommand implements EnterableCommand {
    String current_str;

    public ENTERCommand(RPNCore core) {
        super(core);
        current_str = core.getDisplay().getValue();

        if(current_str.length() == 0)
            current_str = core.getStack().getCurrentStack()[0].toString();
    }

    @Override
    public void executable() {
        Double current = Double.parseDouble(current_str);
        core.getDisplay().setVolitileValue(current_str);
        core.getStack().push(current);
    }
}
