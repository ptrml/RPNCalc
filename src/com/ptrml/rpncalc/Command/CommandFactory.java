package com.ptrml.rpncalc.Command;

import com.ptrml.rpncalc.RPNCommands;
import com.ptrml.rpncalc.RPNStack;

/**
 * Created by ptrml on 12/14/2016.
 */
public class CommandFactory {
    /**
     * @param c karakter na operatorot
     * @return Special
     * @throws Exception ako karakterot ne e validen operator
     */
    public static Command getCommand(Character c,RPNStack stack) throws Exception {

        if(c.equals(RPNCommands.ACOS))
        {
            return new ACOSCommand(stack);
        }
        else if(c.equals(RPNCommands.ADD))
        {
            return new ADDCommand(stack);
        }
        else if(c.equals(RPNCommands.ASIN))
        {
            return new ASINCommand(stack);
        }
        else if(c.equals(RPNCommands.ATAN))
        {
            return new ATANCommand(stack);
        }
        else if(c.equals(RPNCommands.CHS))
        {
            return new CHSCommand(stack);
        }
        else if(c.equals(RPNCommands.COS))
        {
            return new COSCommand(stack);
        }
        else if(c.equals(RPNCommands.DIVIDE))
        {
            return new DIVIDECommand(stack);
        }
        else if(c.equals(RPNCommands.DROP))
        {
            return new DROPCommand(stack);
        }
        else if(c.equals(RPNCommands.MULTIPLY))
        {
            return new MULTIPLYCommand(stack);
        }
        else if(c.equals(RPNCommands.SIN))
        {
            return new SINCommand(stack);
        }
        else if(c.equals(RPNCommands.SUBTRACT))
        {
            return new SUBTRACTCommand(stack);
        }
        else if(c.equals(RPNCommands.SWAP))
        {
            return new SWAPCommand(stack);
        }
        else if(c.equals(RPNCommands.TAN))
        {
            return new TANCommand(stack);
        }



        else
            throw new Exception("No such command!");
    }


    public static Boolean isCommand(Character c)  {

        if(c.equals(RPNCommands.ACOS))
        {
            return true;// new ACOSCommand(stack);
        }
        else if(c.equals(RPNCommands.ADD))
        {
            return true;// new ADDCommand(stack);
        }
        else if(c.equals(RPNCommands.ASIN))
        {
            return true;// new ASINCommand(stack);
        }
        else if(c.equals(RPNCommands.ATAN))
        {
            return true;// new ATANCommand(stack);
        }
        else if(c.equals(RPNCommands.CHS))
        {
            return true;// new CHSCommand(stack);
        }
        else if(c.equals(RPNCommands.COS))
        {
            return true;// new COSCommand(stack);
        }
        else if(c.equals(RPNCommands.DIVIDE))
        {
            return true;// new DIVIDECommand(stack);
        }
        else if(c.equals(RPNCommands.DROP))
        {
            return true;// new DROPCommand(stack);
        }
        else if(c.equals(RPNCommands.MULTIPLY))
        {
            return true;// new MULTIPLYCommand(stack);
        }
        else if(c.equals(RPNCommands.SIN))
        {
            return true;// new SINCommand(stack);
        }
        else if(c.equals(RPNCommands.SUBTRACT))
        {
            return true;// new SUBTRACTCommand(stack);
        }
        else if(c.equals(RPNCommands.SWAP))
        {
            return true;// new SWAPCommand(stack);
        }
        else if(c.equals(RPNCommands.TAN))
        {
            return true;// new TANCommand(stack);
        }
        else if(c.equals(RPNCommands.ENTER))
        {
            return true;// new TANCommand(stack);
        }



        else
            return false;
    }

    /**
     * Enter is not included because the constructor needs additional double to feed into the stack
     * Keepking EnterCommand for undo/redo puproses
     * @param stack
     * @param input
     * @return Command
     */
    public static Command getENTER(RPNStack stack,Double input) {

        return new ENTERCommand(stack,input);
    }

}
