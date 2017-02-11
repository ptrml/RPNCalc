package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.UndoableCommand;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.UndoHandler.MementoCaretaker;

/**
 * Created by ptrml on 2/7/2017.
 */
public class DigitEnteredCommand extends UndoableCommand implements EnterableCommand{

    Character input;
    public DigitEnteredCommand(RPNCore core, Character input) {
        super(core);
        this.input = input;
    }

    @Override
    public void executable() {
        core.getDisplay().appendValue(input);
    }

}
