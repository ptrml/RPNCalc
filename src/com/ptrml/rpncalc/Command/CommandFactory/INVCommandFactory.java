package com.ptrml.rpncalc.Command.CommandFactory;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.SpecialCommand.ACCommand;
import com.ptrml.rpncalc.Command.SpecialCommand.INVCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.*;
import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Gi vrakja komandite koi imaat "inv" podfunkcija
 */
public class INVCommandFactory extends CommandFactory {
    /**
     * @param c karakter na operatorot
     * @return Command
     * @throws Exception ako karakterot ne e validen operator
     */
    public Command getCommand(Character c, RPNCore core) {

        core.setState(CharLegend.getInstance().STATE_NORMAL);
        if(c.equals(CharLegend.getInstance().INV))
        {
            return new INVCommand(core);
        }
        if(c.equals(CharLegend.getInstance().COS))
        {
            return new INVCOSCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().SIN))
        {
            return new INVSINCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().TAN))
        {
            return new INVTANCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().AC))
        {
            return new ACCommand(core);

        }


        return null;

        /*else
            throw new Exception("No such command!");*/
    }


}
