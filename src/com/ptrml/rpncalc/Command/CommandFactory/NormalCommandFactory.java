package com.ptrml.rpncalc.Command.CommandFactory;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.SpecialCommand.*;
import com.ptrml.rpncalc.Command.UndoableCommand.*;
import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.RPNCore;

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


        if(c.equals(CharLegend.getInstance().ACOS))
        {
            return new INVCOSCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().ADD))
        {
            return new ADDCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().ASIN))
        {
            return new INVSINCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().ATAN))
        {
            return new INVTANCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().CHS))
        {
            return new CHSCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().COS))
        {
            return new COSCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().DIVIDE))
        {
            return new DIVIDECommand(core);
        }
        else if(c.equals(CharLegend.getInstance().DROP))
        {
            return new DROPCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().MULTIPLY))
        {
            return new MULTIPLYCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().SIN))
        {
            return new SINCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().SUBTRACT))
        {
            return new SUBTRACTCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().SWAP))
        {
            return new SWAPCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().TAN))
        {
            return new TANCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().ENTER))
        {
            return new ENTERCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().ZERO) || c.equals(CharLegend.getInstance().ONE) || c.equals(CharLegend.getInstance().TWO) || c.equals(CharLegend.getInstance().THREE) || c.equals(CharLegend.getInstance().FOUR) || c.equals(CharLegend.getInstance().FIVE) || c.equals(CharLegend.getInstance().SIX) || c.equals(CharLegend.getInstance().SEVEN) || c.equals(CharLegend.getInstance().EIGHT) || c.equals(CharLegend.getInstance().NINE) || c.equals(CharLegend.getInstance().POINT))
        {
            return new DigitEnteredCommand(core,c);
        }

        else if(c.equals(CharLegend.getInstance().UNDO))
        {
            return new UNDOCommand(core);
        }

        else if(c.equals(CharLegend.getInstance().REDO))
        {
            return new REDOCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().STO))
        {
            return new STOCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().RCL))
        {
            return new RCLCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().INV))
        {
            return new INVCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().DRG))
        {
            return new DRGCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().AC))
        {
            return new ACCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().PROG))
        {
            return new PROGCommand(core);
        }
        else if(c.equals(CharLegend.getInstance().EXE))
        {
            return new EXECommand(core);
        }


        return null;

        /*else
            throw new Exception("No such command!");*/
    }


}
