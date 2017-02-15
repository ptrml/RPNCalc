package com.ptrml.rpncalc.RPNWorker;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.NUMINPUTCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.UndoableCommand;
import com.ptrml.rpncalc.RPNCore;

import java.util.List;

/**
 * Invoker koga sistemot e vo normalna sostojba
 */
public class RPNWorker_Calculate extends RPNWorker {

    public RPNWorker_Calculate(RPNCore core) {
        super(core);
    }

    public void execute(Command command) throws Exception {
        if(command != null)
        {
            //purge display (NumComposer) if not empty
            if(!core.getNumComposer().isEmpty() && (command instanceof UndoableCommand) && !(command instanceof EnterableCommand))
                new NUMINPUTCommand(core).execute();

            command.execute();
        }
    }

}
