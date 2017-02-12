package com.ptrml.rpncalc.Command.CommandFactory;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.SpecialCommand.ACCommand;
import com.ptrml.rpncalc.Command.SpecialCommand.INVCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.*;
import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 12/14/2016.
 */
public class INVCommandFactory extends CommandFactory {
    /**
     * @param c karakter na operatorot
     * @return Special
     * @throws Exception ako karakterot ne e validen operator
     */
    public Command getCommand(Character c, RPNCore core) {

        if(c.equals(CharLegend.INV))
        {
            return new INVCommand(core);
        }
        if(c.equals(CharLegend.COS))
        {
            return new INVCOSCommand(core);
        }
        else if(c.equals(CharLegend.SIN))
        {
            return new INVSINCommand(core);
        }
        else if(c.equals(CharLegend.TAN))
        {
            return new INVTANCommand(core);
        }
        else if(c.equals(CharLegend.AC))
        {
            return new ACCommand(core);
        }


        return null;

        /*else
            throw new Exception("No such command!");*/
    }


}
