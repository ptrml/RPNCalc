package com.ptrml.rpncalc;


import com.ptrml.rpncalc.Command.CommandFactory.*;
import com.ptrml.rpncalc.RPNWorker.RPNWorker;
import com.ptrml.rpncalc.RPNWorker.RPNWorker_Calculate;
import com.ptrml.rpncalc.RPNWorker.RPNWorker_Program;

/**
 * Created by ptrml on 1/5/2017.
 */
public class RPNCalc {

    private RPNCore core;
    private CommandFactory commandFactory;
    private NormalCommandFactory normalCommandFactory;
    private INVCommandFactory invCommandFactory;
    private RCLCommandFactory rclCommandFactory;
    private STOCommandFactory stoCommandFactory;

    private RPNWorker rpnWorker;
    private RPNWorker_Calculate rpnWorker_calculate;
    private RPNWorker_Program rpnWorker_program;



    public RPNCalc() {
        core = new RPNCore();

        rpnWorker_calculate = new RPNWorker_Calculate(core);
        rpnWorker_program = new RPNWorker_Program(core);

        normalCommandFactory = new NormalCommandFactory();
        invCommandFactory = new INVCommandFactory();
        rclCommandFactory = new RCLCommandFactory();
        stoCommandFactory = new STOCommandFactory();
    }

    public void input(Character input) throws Exception {

        System.out.println(input);

        this.setState(core);

        rpnWorker.execute(commandFactory.getCommand(input,core));

    }

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

        if(core.getPROGFlag())
            rpnWorker = rpnWorker_program;
        else
            rpnWorker = rpnWorker_calculate;
    }
}

