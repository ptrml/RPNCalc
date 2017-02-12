package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/7/2017.
 */
public class PROGCommand extends SpecialCommand {

    public PROGCommand(RPNCore core) {
        super(core);
    }

    @Override
    public void executable() {
        if(!core.getPROGFlag()){
            core.getProgramManager().clearProgram_slots();
        }
        core.setPROGFlag(!core.getPROGFlag());
    }

}
