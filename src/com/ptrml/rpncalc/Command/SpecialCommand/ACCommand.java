package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.Command.UndoableCommand.UndoableCommand;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class ACCommand extends SpecialCommand {

    public ACCommand(RPNCore core) {
        super(core);
    }


    @Override
    public void executable() {

        core.clearMemory();
    }

}
