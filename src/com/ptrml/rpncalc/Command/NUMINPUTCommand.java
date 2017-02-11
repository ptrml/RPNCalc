package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
public class NUMINPUTCommand extends Command {
    String current_str;
    RPNCore core;

    public NUMINPUTCommand(RPNCore core) {
        super(core.getStack());
        this.core = core;
        current_str = core.getDisplay().getValue();//have to get value here, display blanked in worker
    }

    @Override
    public void execute() {
        Double current = Double.parseDouble(current_str);
        core.getDisplay().setNormalValue("");
        stack.push(current);
    }

    @Override
    public void undo() {
        stack.pull();
    }
}
