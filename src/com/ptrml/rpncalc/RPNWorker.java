package com.ptrml.rpncalc;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.UndoableCommand.NUMINPUTCommand;
import com.ptrml.rpncalc.Command.UndoableCommand.UndoableCommand;

import java.util.List;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RPNWorker {
    //private RPNStack stack;
    private RPNCore core;

    //TODO VALJDA TREBA STATE PATTERN TUKA

    //a command was entered last turn. If a digit is pressed after a command, the X stack should reset. Command after command should use the same number.
    private Boolean command_flag = false;
    private Boolean enter_flag = false;



    private List<Command> progList;


    public RPNWorker(RPNCore core) {
        this.core = core;
    }



    public void COMMAND(Command command) throws Exception {

        if(command != null)
        {
            command.execute();

        }
    }


/*
    public void DIGIT(Character input){
        core.getDisplay().appendValue(input);
    }*/

    /*
    public void UNDO() throws Exception {
        try
        {
            Command command = undoList.get(undoList.size() - 1);
            redoList.add(command);
            command.undo();
            undoList.remove(command);
        }
        catch (Exception e)
        {
            throw new Exception("Nothing to Undo");
        }

        System.out.println("pl="+progList.size());
    };
    public void REDO() throws Exception {

        try
        {
            Command command = redoList.get(redoList.size() - 1);
            undoList.add(command);
            command.execute();
            redoList.remove(command);
        }
        catch (Exception e)
        {
            throw new Exception("Nothing to Redo");
        }
    };
    public void STO(Integer position, Double num){
        memory_slots[position] = num;
    };
    public Double RCL(Integer position) throws Exception {
        try
        {
            return memory_slots[position];
        }
        catch (Exception e)
        {
            throw new Exception("Nothing to Recall");
        }
    };
    public void PROG_add(Command command){
        progList.add(command);
    };
    public void PROG_clear() {
        progList.clear();
    }

    public void EXE(){
        for (Command command : progList)
        {
            System.out.println(command.getClass());
            this.COMMAND(command);
        }
    };
*/


}
