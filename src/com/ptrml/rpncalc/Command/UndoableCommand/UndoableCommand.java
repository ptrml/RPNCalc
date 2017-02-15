package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.UndoHandler.MementoCaretaker;

/**
 * Normalni komandi, se pravi memento pred izvrsuvanje so template pattern
 */
abstract public class UndoableCommand extends Command {

    public UndoableCommand(RPNCore core) {
        super(core);
    }



    public void execute() throws Exception {
        core.getMementoCaretaker().addMemento(core.createMemento());
        this.executable();
        core.notifyObservers();
    };

    abstract public void executable() throws Exception;



}
