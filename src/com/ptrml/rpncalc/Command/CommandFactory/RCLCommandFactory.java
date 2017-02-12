package com.ptrml.rpncalc.Command.CommandFactory;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.SpecialCommand.ACCommand;
import com.ptrml.rpncalc.Command.SpecialCommand.RCLCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.*;
import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 12/14/2016.
 */
public class RCLCommandFactory extends CommandFactory {
    /**
     * @param c karakter na operatorot
     * @return Special
     * @throws Exception ako karakterot ne e validen operator
     */
    public Command getCommand(Character c, RPNCore core) {


        if(c.equals(CharLegend.RCL))
        {
            return new RCLCommand(core);
        }
        else if(c.equals(CharLegend.ZERO) || c.equals(CharLegend.ONE) || c.equals(CharLegend.TWO) || c.equals(CharLegend.THREE) || c.equals(CharLegend.FOUR) || c.equals(CharLegend.FIVE) || c.equals(CharLegend.SIX) || c.equals(CharLegend.SEVEN) || c.equals(CharLegend.EIGHT) || c.equals(CharLegend.NINE))
        {
            return new RCLNumCommand(core,c);
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
