package com.ptrml.rpncalc.Command.SpecialCommand;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Komandi so specijalna namena, ne se zapisuvaat vo memento
 */
abstract public class SpecialCommand extends Command {

    public SpecialCommand(RPNCore core) {
        super(core);
    }

    public void execute() throws Exception {

        this.executable();
        core.notifyObservers();
    };

    public abstract void executable() throws Exception;

}
