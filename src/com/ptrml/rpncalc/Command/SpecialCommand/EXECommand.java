package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class EXECommand extends SpecialCommand {

    public EXECommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() throws Exception {
        for(Command cmd : core.getProgramManager().getProgram_slots()) {
            if (cmd != null) {
                cmd.execute();
            }
        }
    }

}
