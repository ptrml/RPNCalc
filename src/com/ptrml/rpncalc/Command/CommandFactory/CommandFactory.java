package com.ptrml.rpncalc.Command.CommandFactory;

import com.ptrml.rpncalc.Command.*;
import com.ptrml.rpncalc.CommandsLegend;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

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
