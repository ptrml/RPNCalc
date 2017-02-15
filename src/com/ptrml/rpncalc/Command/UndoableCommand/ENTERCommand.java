package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.RPNCore;

/**
 * Ja vnesuva vrednosta od ekranot vo stekot
 */
public class ENTERCommand extends UndoableCommand implements EnterableCommand {
    private String current_str;
    public ENTERCommand(RPNCore core) {
        super(core);

        current_str = core.getNumComposer().getValue();
    }

    @Override
    public void executable() {

        if(current_str.length() == 0)
            current_str = core.getStack().getCurrentStack()[0].toString();

        Double current = Double.parseDouble(current_str);
        core.getNumComposer().setVolatileValue(current.toString());
        core.getStack().push(current);
    }
}
