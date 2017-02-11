package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class ENTERCommand extends Command {
    String current_str;
    RPNCore core;

    public ENTERCommand(RPNCore core) {
        super(core.getStack());
        this.core = core;
        current_str = core.getDisplay().getValue();
    }

    @Override
    public void execute() {
        core.getDisplay().setVolitileValue(current_str);
    }

    @Override
    public void undo() {
        core.getDisplay().setNormalValue("");
    }
}
