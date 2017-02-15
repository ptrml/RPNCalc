package com.ptrml.rpncalc.RPNWorker;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.RPNCore;

/**
 * Invoker so sostojbi
 */
public abstract class RPNWorker {
    protected RPNCore core;

    public RPNWorker(RPNCore core) {
        this.core = core;
    }

    public abstract void execute(Command command) throws Exception;
}
