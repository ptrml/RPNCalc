package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.UndoHandler.MementoCaretaker;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class UNDOCommand extends SpecialCommand {

    public UNDOCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        MementoCaretaker mc = MementoCaretaker.getInstance();
        mc.undo(core);
    }

}
