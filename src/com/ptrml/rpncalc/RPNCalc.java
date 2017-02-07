package com.ptrml.rpncalc;


import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.CommandFactory;

/**
 * Created by ptrml on 1/5/2017.
 */
public class RPNCalc {

    //TODO RADS/DEG


    private RPNStack stack;
    private RPNCore core;
    private RPNDisplay display;


    public RPNCalc() {
        stack = new RPNStack();
        core = new RPNCore(stack);
    }

    public void input(Character input) throws Exception {
        if(this.isDigit(input))
            this.onDigit(input);
        else if(input.equals(RPNCommands.UNDO))
            this.onUNDO();
        else if(input.equals(RPNCommands.REDO))
            this.onREDO();
        else if(input.equals(RPNCommands.STO))
            onSTO();
        else if(input.equals(RPNCommands.RCL))
            onRCL();
        else if(input.equals(RPNCommands.PROG))
            onPROG();
        else if(input.equals(RPNCommands.EXE))
            this.onEXE();
        else if (CommandFactory.isCommand(input))
            this.onCommand(input);
        else
            this.onUnknown();

    }

    private void onUnknown() throws Exception {
        //this.clearCurrent();
        throw new Exception("Unknown input");
    }


    ;


    /**
     * @param input
     */
    private void onDigit(Character input) throws Exception {

        Integer newinput = Integer.parseInt(input.toString());

        if(display.getSTOFlag())
        {
            core.STO(newinput, this.getCurrent());
            display.setSTOFlag(false);
        }            
        else if(display.getRCLFlag())
        {
            core.command(CommandFactory.getENTER(stack,core.RCL(newinput)));
            display.setRCLFlag(false);
        }
        else
            appendDigit(newinput);
    };

    private void appendDigit(Integer input){
        Double current = this.getCurrent();
        display.setCurrent_value((current*10)+input);
    }

    private void onUNDO() throws Exception {
        core.UNDO();
    };
    private void onREDO() throws Exception {
        core.REDO();
    };
    private void onSTO(){
        display.setSTOFlag(!display.getSTOFlag());
    };
    private void onRCL() {
        display.setRCLFlag(!display.getRCLFlag());
    };
    private void onPROG(){
        if(display.getPROGFlag())
        {
            core.PROG_clear();
        }
        display.setPROGFlag(!display.getPROGFlag());
    };
    private void onEXE(){
        core.EXE();
    };



    private void onCommand(Character input) throws Exception {

        Command command;

        if(input.equals(RPNCommands.ENTER))
            command = CommandFactory.getENTER(stack,this.getCurrent());
        else
            command = CommandFactory.getCommand(input,stack);

        if(display.getPROGFlag())
            core.PROG_add(command);

    }



    private Boolean isDigit(Character input)
    {
        return (input >= '0' && input <= '9') || input == '.';
    }



    public RPNStack getStack()
    {
        return stack;
    }

    public Double getCurrent() {
        return display.getCurrent_value();
    }
    /*public void clearCurrent() {
        display.clearCurrent_value();
    }*/
}

