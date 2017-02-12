package com.ptrml.rpncalc.RPNWorker;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/12/2017.
 */
public abstract class RPNWorker {
    protected RPNCore core;

    public RPNWorker(RPNCore core) {
        this.core = core;
    }

    public abstract void execute(Command command) throws Exception;
}
