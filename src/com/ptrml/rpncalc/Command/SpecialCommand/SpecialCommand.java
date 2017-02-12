package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
abstract public class SpecialCommand extends Command {

    public SpecialCommand(RPNCore core) {
        super(core);
    }

    public void execute() throws Exception {
        //TODO template
        this.executable();
        core.notifyObservers();
    };

    public abstract void executable() throws Exception;

}
