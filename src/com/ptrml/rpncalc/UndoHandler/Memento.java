package com.ptrml.rpncalc.UndoHandler;

import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 2/11/2017.
 */
public class Memento {
    Double[] stack;

    Boolean displayVolatile;
    String displayVal;

    public Memento(RPNCore core) {

        this.stack = core.getStack().getCurrentStack();
        this.displayVolatile = core.getNumComposer().getIsVolatile();
        this.displayVal = core.getNumComposer().getValue();
    }

    public Double[] getStack()
    {
        return this.stack;
    }

    public Boolean getDisplayVolatile() {
        return displayVolatile;
    }

    public String getDisplayVal() {
        return displayVal;
    }
}
