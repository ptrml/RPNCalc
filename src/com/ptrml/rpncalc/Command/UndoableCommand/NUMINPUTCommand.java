package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.Command.SpecialCommand.SpecialCommand;
import com.ptrml.rpncalc.RPNCore;

/**
 * Pomosna komanda koja se povikuva programski. Se koristi ako e povikana nekoja operacija dodeka vrednosta na ekranot ne e vnesena vo stekot
 */
public class NUMINPUTCommand extends UndoableCommand implements EnterableCommand {
    String current_str;
    public NUMINPUTCommand(RPNCore core) {
        super(core);
        current_str = core.getNumComposer().getValue();
    }

    @Override
    public void executable() {

        Double current = Double.parseDouble(current_str);
        core.getNumComposer().setNormalValue("");
        core.getStack().push(current);
    }

}
