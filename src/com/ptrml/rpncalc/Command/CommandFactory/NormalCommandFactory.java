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


        System.out.println(CharLegend.ONE + " " + c);
        if(c.equals(CharLegend.ACOS))
        {
            return new INVCOSCommand(core);
        }
        else if(c.equals(CharLegend.ADD))
        {
            return new ADDCommand(core);
        }
        else if(c.equals(CharLegend.ASIN))
        {
            return new INVSINCommand(core);
        }
        else if(c.equals(CharLegend.ATAN))
        {
            return new INVTANCommand(core);
        }
        else if(c.equals(CharLegend.CHS))
        {
            return new CHSCommand(core);
        }
        else if(c.equals(CharLegend.COS))
        {
            return new COSCommand(core);
        }
        else if(c.equals(CharLegend.DIVIDE))
        {
            return new DIVIDECommand(core);
        }
        else if(c.equals(CharLegend.DROP))
        {
            return new DROPCommand(core);
        }
        else if(c.equals(CharLegend.MULTIPLY))
        {
            return new MULTIPLYCommand(core);
        }
        else if(c.equals(CharLegend.SIN))
        {
            return new SINCommand(core);
        }
        else if(c.equals(CharLegend.SUBTRACT))
        {
            return new SUBTRACTCommand(core);
        }
        else if(c.equals(CharLegend.SWAP))
        {
            return new SWAPCommand(core);
        }
        else if(c.equals(CharLegend.TAN))
        {
            return new TANCommand(core);
        }
        else if(c.equals(CharLegend.ENTER))
        {
            return new ENTERCommand(core);
        }
        else if(c.equals(CharLegend.ZERO) || c.equals(CharLegend.ONE) || c.equals(CharLegend.TWO) || c.equals(CharLegend.THREE) || c.equals(CharLegend.FOUR) || c.equals(CharLegend.FIVE) || c.equals(CharLegend.SIX) || c.equals(CharLegend.SEVEN) || c.equals(CharLegend.EIGHT) || c.equals(CharLegend.NINE) || c.equals(CharLegend.POINT))
        {
            return new DigitEnteredCommand(core,c);
        }

        else if(c.equals(CharLegend.UNDO))
        {
            return new UNDOCommand(core);
        }

        else if(c.equals(CharLegend.REDO))
        {
            return new REDOCommand(core);
        }
        else if(c.equals(CharLegend.STO))
        {
            return new STOCommand(core);
        }
        else if(c.equals(CharLegend.RCL))
        {
            return new RCLCommand(core);
        }
        else if(c.equals(CharLegend.INV))
        {
            return new INVCommand(core);
        }
        else if(c.equals(CharLegend.DRG))
        {
            return new DRGCommand(core);
        }
        else if(c.equals(CharLegend.AC))
        {
            return new ACCommand(core);
        }
        else if(c.equals(CharLegend.PROG))
        {
            return new PROGCommand(core);
        }
        else if(c.equals(CharLegend.EXE))
        {
            return new EXECommand(core);
        }


        return null;

        /*else
            throw new Exception("No such command!");*/
    }


}
