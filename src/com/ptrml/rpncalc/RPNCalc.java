package com.ptrml.rpncalc;


import com.ptrml.rpncalc.Command.CommandFactory.*;

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
    private CommandFactory commandFactory;
    private NormalCommandFactory normalCommandFactory;
    private INVCommandFactory invCommandFactory;
    private RCLCommandFactory rclCommandFactory;
    private STOCommandFactory stoCommandFactory;



    public RPNCalc() {
        stack = new RPNStack();
        core = new RPNCore(stack);
        worker = new RPNWorker(core);

        normalCommandFactory = new NormalCommandFactory();
        invCommandFactory = new INVCommandFactory();
        rclCommandFactory = new RCLCommandFactory();
        stoCommandFactory = new STOCommandFactory();
    }

    public void input(Character input) throws Exception {

        System.out.println(input);

        this.setState(core);

        worker.COMMAND(commandFactory.getCommand(input,core));

        core.notifyObservers();
    }
/*
    private void onUnknown() throws Exception {
        //this.clearCurrent();
        throw new Exception("Unknown input");
    }*/


    ;



/*

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

*/







    public RPNCore getCore() {
        return core;
    }

    private void setState(RPNCore core)
    {
        if(core.getState() == CharLegend.STATE_NORMAL)
            commandFactory = normalCommandFactory;
        else if (core.getState() == CharLegend.STATE_INV)
            commandFactory = invCommandFactory;
        else if (core.getState() == CharLegend.STATE_RCL)
            commandFactory = rclCommandFactory;
        else if (core.getState() == CharLegend.STATE_STO)
            commandFactory = stoCommandFactory;

    }
}

