package com.ptrml.rpncalc.RPNWorker;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.NUMINPUTCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.UndoableCommand;
import com.ptrml.rpncalc.RPNCore;

import java.util.List;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RPNWorker_Calculate extends RPNWorker {

    public RPNWorker_Calculate(RPNCore core) {
        super(core);
    }

    public void execute(Command command) throws Exception {
        if(command != null)
        {
            //purge display
            if(!core.getNumComposer().isEmpty() && (command instanceof UndoableCommand) && !(command instanceof EnterableCommand))
                new NUMINPUTCommand(core).execute();

            command.execute();
        }
    }

}
