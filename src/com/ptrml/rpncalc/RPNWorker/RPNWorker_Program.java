package com.ptrml.rpncalc.RPNWorker;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.DigitEnteredCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.ENTERCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.NUMINPUTCommand;
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

            if(command instanceof UndoableCommand && !(command instanceof DigitEnteredCommand))
            {
                //purge display
                if(!core.getNumComposer().isEmpty() && !(command instanceof EnterableCommand) && !isShowingStatus())
                    core.getProgramManager().setProgram_slot(new NUMINPUTCommand(core));

                core.getProgramManager().setProgram_slot(command);

                //Enter depends on value being available on the composer
                if(!(command instanceof ENTERCommand))
                    core.getNumComposer().setVolatileValue("P: "+core.getProgramManager().getCursor()+"/"+core.getProgramManager().getMax());


                //core.getNumComposer().setNormalValue("");
                core.notifyObservers();
            }
            else
            {
                //if status, reset to blank
                if(isShowingStatus())
                    core.getNumComposer().setNormalValue("");

                //purge display
                if(!core.getNumComposer().isEmpty() && !(command instanceof EnterableCommand))
                    new NUMINPUTCommand(core).execute();

                command.execute();
            }
        }

    }

    private Boolean isShowingStatus()
    {
        return core.getNumComposer().getValue().startsWith("P: ");
    }

}
