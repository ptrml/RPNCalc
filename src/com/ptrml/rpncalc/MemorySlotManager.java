package com.ptrml.rpncalc;

/**
 * Created by ptrml on 2/12/2017.
 */
public class MemorySlotManager {
    private Double[] memory_slots;

    public MemorySlotManager() {
        this.memory_slots = new Double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
    }

    public Double getMemory_slot(Integer slot) {
        return memory_slots[slot];
    }

    public void setMemory_slot(Integer slot, Double input) {
        this.memory_slots[slot] = input;
    }

    public void clearSlots(){
        for (int i = 0; i<memory_slots.length ; i++)
        {
            memory_slots[i]=0.0;
        }
    }
}
