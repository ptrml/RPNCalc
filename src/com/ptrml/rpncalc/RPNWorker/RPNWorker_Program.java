package com.ptrml.rpncalc.RPNWorker;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.UndoableCommand.UndoableCommand;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RPNWorker_Program extends RPNWorker {

    public RPNWorker_Program(RPNCore core) {
        super(core);
    }

    public void execute(Command command) throws Exception {
        if(command != null)
        {
            if(command instanceof UndoableCommand )
            {
                core.getProgramManager().setProgram_slot(command);
            }
            else
            {
                command.execute();
            }
        }

    }

}
