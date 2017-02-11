package com.ptrml.rpncalc.Command.CommandFactory;

import com.ptrml.rpncalc.Command.*;
import com.ptrml.rpncalc.CommandsLegend;
import com.ptrml.rpncalc.RPNCore;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 12/14/2016.
 */
public class NormalCommandFactory extends CommandFactory {
    /**
     * @param c karakter na operatorot
     * @return Special
     * @throws Exception ako karakterot ne e validen operator
     */
    public Command getCommand(Character c, RPNCore core) {

        RPNStack stack = core.getStack();

        if(c.equals(CommandsLegend.ACOS))
        {
            return new ACOSCommand(stack);
        }
        else if(c.equals(CommandsLegend.ADD))
        {
            return new ADDCommand(stack);
        }
        else if(c.equals(CommandsLegend.ASIN))
        {
            return new ASINCommand(stack);
        }
        else if(c.equals(CommandsLegend.ATAN))
        {
            return new ATANCommand(stack);
        }
        else if(c.equals(CommandsLegend.CHS))
        {
            return new CHSCommand(stack);
        }
        else if(c.equals(CommandsLegend.COS))
        {
            return new COSCommand(stack);
        }
        else if(c.equals(CommandsLegend.DIVIDE))
        {
            return new DIVIDECommand(stack);
        }
        else if(c.equals(CommandsLegend.DROP))
        {
            return new DROPCommand(stack);
        }
        else if(c.equals(CommandsLegend.MULTIPLY))
        {
            return new MULTIPLYCommand(stack);
        }
        else if(c.equals(CommandsLegend.SIN))
        {
            return new SINCommand(stack);
        }
        else if(c.equals(CommandsLegend.SUBTRACT))
        {
            return new SUBTRACTCommand(stack);
        }
        else if(c.equals(CommandsLegend.SWAP))
        {
            return new SWAPCommand(stack);
        }
        else if(c.equals(CommandsLegend.TAN))
        {
            return new TANCommand(stack);
        }
        else if(c.equals(CommandsLegend.ENTER))
        {
            return new ENTERCommand(core);
        }
        /*else if(c.equals(CommandsLegend.ZERO) || c.equals(CommandsLegend.ONE) || c.equals(CommandsLegend.TWO) || c.equals(CommandsLegend.THREE) || c.equals(CommandsLegend.FOUR) || c.equals(CommandsLegend.FIVE) || c.equals(CommandsLegend.SIX) || c.equals(CommandsLegend.SEVEN) || c.equals(CommandsLegend.EIGHT) || c.equals(CommandsLegend.NINE))
        {
            return new NUMINPUTCommand(core);
        }*/


        return null;

        /*else
            throw new Exception("No such command!");*/
    }


}
