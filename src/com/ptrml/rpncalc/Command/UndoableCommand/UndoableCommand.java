package com.ptrml.rpncalc.Command.UndoableCommand;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.EnterableCommand;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.UndoHandler.MementoCaretaker;

/**
 * Created by ptrml on 2/7/2017.
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
