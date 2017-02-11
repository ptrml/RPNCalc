package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/7/2017.
 */
abstract public class Command{

    protected RPNCore core;

    public Command(RPNCore core) {
        this.core = core;
    }

    abstract public void execute() throws Exception;

}
