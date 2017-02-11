package com.ptrml.rpncalc.Command.CommandFactory;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 12/14/2016.
 */
public abstract class CommandFactory {
    /**
     * @param c karakter na operatorot
     * @return Special
     * @throws Exception ako karakterot ne e validen operator
     */

    public abstract Command getCommand(Character c, RPNCore core);



}
