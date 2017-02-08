package com.ptrml.rpncalc;

import com.ptrml.rpncalc.Command.Command;
import com.ptrml.rpncalc.Command.CommandFactory;
import com.ptrml.rpncalc.Command.ENTERCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RPNCore {
    private RPNStack stack;

    //a command was entered last turn. If a digit is pressed after a command, the X stack should reset. Command after command should use the same number.
    private Boolean command_flag = false;
    private Boolean enter_flag = false;

    Double[] memory_slots = new Double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};

    private List<Command> undoList;
    private List<Command> redoList;

    private List<Command> progList;

    public RPNCore(RPNStack stack) {
        this.stack = stack;
        this.undoList = new ArrayList<>();
        this.redoList = new ArrayList<>();
    }



    /*public void ENTER(Double input){
        new ENTERCommand(stack,input).execute();
    };*/

    public void UNDO() throws Exception {
        try
        {
            Command command = undoList.get(undoList.size() - 1);
            undoList.remove(undoList.size() - 1);
            command.undo();
            redoList.add(command);
        }
        catch (Exception e)
        {
            throw new Exception("Nothing to Undo");
        }

    };
    public void REDO() throws Exception {
        try
        {
            Command command = redoList.get(undoList.size() - 1);
            redoList.remove(undoList.size() - 1);
            command.execute();
            undoList.add(command);
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
            this.command(command);
        }
    };

    public void command(Command command) {
        command_flag = false;
        enter_flag = false;

        if(command.getClass() == ENTERCommand.class)
            enter_flag = true;
        else
            command_flag = true;

        command.execute();
        undoList.add(command);
        redoList.clear();
    }

    public Double getCurrent_value() {
        return stack.getCurrentStack()[0];
    }

    public void setCurrent_value(Double current_value) {
        stack.pull();
        stack.push(current_value);
    }

    public void clearCurrent_value() {
        this.setCurrent_value(0.0);
    }

    public void appendDigit(Integer input){

        if(command_flag)//if command was entered last turn, push the current value up
        {
            command_flag = false;
            stack.push(0.0);
        }
        if(enter_flag)//if enter was entered last turn, reset the current value
        {
            enter_flag = false;
            clearCurrent_value();
        }

        Double current = getCurrent_value();
        setCurrent_value((current*10)+input);
    }




}
