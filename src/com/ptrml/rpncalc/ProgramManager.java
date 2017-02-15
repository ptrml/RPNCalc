package com.ptrml.rpncalc;

import com.ptrml.rpncalc.Command.Command;

/**
 * Keeps saved commands for MACROs
 */
public class ProgramManager {
    private Command[] program_slots;
    private Integer cursor = 0;
    private Integer max = 20;

    public ProgramManager() {
        this.program_slots = new Command[max];
    }

    public Command[] getProgram_slots() {
        return program_slots;
    }

    public void setProgram_slot(Command command) {
        if(!this.isDone())
        {
            this.program_slots[cursor++] = command;
        }
    }

    public void clearProgram_slots() {
        cursor = 0;
        for (int i = 0; i<max ; i++)
        {
            program_slots[i] = null;
        }
    }

    public Boolean isDone()
    {
        return (cursor >= max);
    }

    public Integer getCursor() {
        return cursor;
    }

    public Integer getMax() {
        return max;
    }
}
