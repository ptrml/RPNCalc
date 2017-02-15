package com.ptrml.rpncalc.Command.CommandFactory;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.SpecialCommand.ACCommand;
import com.ptrml.rpncalc.Command.SpecialCommand.RCLCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.*;
import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Vrakja komanda koja ima rcl podfunkcija. Ako e rcl ke go izgasi rcl modot, ako e broj ke zeme zapisana vrednost
 */
public class RCLCommandFactory extends CommandFactory {
    /**
     * @param c karakter na operatorot
     * @return Command
     * @throws Exception ako karakterot ne e validen operator
     */
    public Command getCommand(Character c, RPNCore core) {


        core.setState(CharLegend.getInstance().STATE_NORMAL);
        if(c.equals(CharLegend.getInstance().RCL))
        {
            return new RCLCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().ZERO) || c.equals(CharLegend.getInstance().ONE) || c.equals(CharLegend.getInstance().TWO) || c.equals(CharLegend.getInstance().THREE) || c.equals(CharLegend.getInstance().FOUR) || c.equals(CharLegend.getInstance().FIVE) || c.equals(CharLegend.getInstance().SIX) || c.equals(CharLegend.getInstance().SEVEN) || c.equals(CharLegend.getInstance().EIGHT) || c.equals(CharLegend.getInstance().NINE))
        {
            return new RCLNumCommand(core,c);
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
