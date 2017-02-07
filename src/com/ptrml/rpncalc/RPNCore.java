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
        command.execute();
        undoList.add(command);
        redoList.clear();
    }



}
