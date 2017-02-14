package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.UndoHandler.MementoCaretaker;

/**
 * Created by ptrml on 2/7/2017.
 */
public class REDOCommand extends SpecialCommand {

    public REDOCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        core.getMementoCaretaker().redo(core);
    }

}
