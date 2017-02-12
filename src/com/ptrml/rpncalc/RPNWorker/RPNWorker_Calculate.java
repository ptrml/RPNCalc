package com.ptrml.rpncalc.RPNWorker;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.UndoableCommand.NUMINPUTCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.UndoableCommand;
import com.ptrml.rpncalc.RPNCore;

import java.util.List;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RPNWorker_Calculate {
    private RPNCore core;

    public RPNWorker_Calculate(RPNCore core) {
        this.core = core;
    }



    public void execute(Command command) throws Exception {

        if(command != null)
        {
            command.execute();
        }
    }


}
