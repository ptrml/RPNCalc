package com.ptrml.rpncalc;


import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.CommandFactory.CommandFactory;

/**
 * Created by ptrml on 1/5/2017.
 */
public class RPNCalc {

    //TODO RADS/DEG
    //TODO insert command za program?
    //TODO chain of responsibility shablon
    //TODO veke ima mediator so worker i gui
    //TODO S pattern


    //TODO treba da ima grd komanda i toa vo stekot da postavuva sto se slucuva
    //TODO state pattern za STO,RCL i INV so svoi builderi
    //TODO posledniot input dali bil enter, broj ili obicen command mozebi state na worker a ona gore state na calc


    private RPNStack stack;
    private RPNWorker worker;
    private RPNCore core;



    public RPNCalc() {
        stack = new RPNStack();
        core = new RPNCore(stack);
        worker = new RPNWorker(core);
    }

    public void input(Character input) throws Exception {

        System.out.println(input);

        if(this.isDigit(input))
            this.onDigit(input);
        else if(input.equals(CommandsLegend.UNDO))
            this.onUNDO();
        else if(input.equals(CommandsLegend.REDO))
            this.onREDO();
        else if(input.equals(CommandsLegend.STO))
            onSTO();
        else if(input.equals(CommandsLegend.RCL))
            onRCL();
        else if(input.equals(CommandsLegend.PROG))
            onPROG();
        else if(input.equals(CommandsLegend.EXE))
            this.onEXE();
        else if (CommandFactory.isCommand(input))
            this.onCommand(input);
        else
            this.onUnknown();

        core.notifyObservers();
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

        //Integer newinput = Integer.parseInt(input.toString());

        /*if(core.getSTOFlag())
        {
            worker.STO(newinput, this.getCurrent());
            core.setSTOFlag(false);
        }            
        else if(core.getRCLFlag())
        {
            worker.command(CommandFactory.getENTER(stack,worker.RCL(newinput)));
            core.setRCLFlag(false);
        }
        else*/
            worker.DIGIT(input);
    };



    private void onUNDO() throws Exception {
        worker.UNDO();
    };
    private void onREDO() throws Exception {
        worker.REDO();
    };
    private void onSTO(){
        core.setSTOFlag(!core.getSTOFlag());
    };
    private void onRCL() {
        core.setRCLFlag(!core.getRCLFlag());
    };
    private void onPROG(){
        if(!core.getPROGFlag())
        {
            worker.PROG_clear();
        }
        core.setPROGFlag(!core.getPROGFlag());
    };
    private void onEXE(){
        worker.EXE();
    };



    private void onCommand(Character input) throws Exception {
        Command command;

        command = CommandFactory.getCommand(input,core);

        /*if(core.getPROGFlag())
            worker.PROG_add(command);*/

        worker.COMMAND(command);
    }



    private Boolean isDigit(Character input)
    {
        return (input >= '0' && input <= '9') || input == '.';
    }


    public RPNCore getCore() {
        return core;
    }
}

