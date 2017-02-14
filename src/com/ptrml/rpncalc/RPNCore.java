package com.ptrml.rpncalc;

import com.ptrml.rpncalc.UndoHandler.Memento;
import com.ptrml.rpncalc.UndoHandler.MementoCaretaker;
import com.ptrml.rpncalc.UndoHandler.MementoOriginator;
import com.ptrml.rpncalc.Observe.Observed;
import com.ptrml.rpncalc.Observe.Observing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RPNCore implements Observed,MementoOriginator {

    private Character state;
    private Character trig_mode;
    private Boolean PROGFlag = false;


    private RPNNumComposer numComposer;
    private RPNStack stack;
    private List<Observing> observers;

    private MemorySlotManager memorySlotManager;
    private ProgramManager programManager;
    private MementoCaretaker mementoCaretaker;

    public RPNCore() {
        this.stack = new RPNStack();
        this.observers = new ArrayList<>();
        this.numComposer = new RPNNumComposer();
        this.memorySlotManager = new MemorySlotManager();
        this.programManager = new ProgramManager();
        this.mementoCaretaker = new MementoCaretaker();
        this.clear();
    }

    public void clear(){
        this.setState(CharLegend.getInstance().STATE_NORMAL);
        this.setTrigMode(CharLegend.getInstance().MODE_DEG);
        this.setPROGFlag(false);
        this.getNumComposer().setNormalValue("");
        this.getStack().clearStack();
        this.getMementoCaretaker().clear();
        //this.memorySlotManager.clearSlots();
        //this.programManager.clearProgram_slots();

        notifyObservers();

    }


    //OBSERVER
    @Override
    public void registerObserver(Observing _obsrv) {
        observers.add(_obsrv);
    }

    @Override
    public void unregisterObserver(Observing _obsrv) {
        observers.remove(_obsrv);
    }

    @Override
    public void notifyObservers() {
        for(Observing observer : observers)
        {
            observer.notifyObserving();
        }
    }

    //MEMENTO
    @Override
    public void setState(Memento coreMemento) {
        stack.flashCurrentStack(coreMemento.getStack());
        this.getNumComposer().setNormalValue("");

        if(coreMemento.getDisplayVolatile())
            this.getNumComposer().setVolatileValue(coreMemento.getDisplayVal());
        else
            this.getNumComposer().setNormalValue(coreMemento.getDisplayVal());


        notifyObservers();
    }

    @Override
    public Memento createMemento() {
        return new Memento(this);
    }

    public Boolean getPROGFlag() {
        return PROGFlag;
    }

    public void setPROGFlag(Boolean PROGFlag) {
        this.PROGFlag = PROGFlag;
    }

    public RPNStack getStack() {
        return stack;
    }

    public RPNNumComposer getNumComposer(){
        return this.numComposer;
    };

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;

        notifyObservers();
    }

    public MemorySlotManager getMemorySlotManager() {
        return memorySlotManager;
    }

    public Character getTrigMode() {
        return trig_mode;
    }

    public void setTrigMode(Character mode) {
        this.trig_mode = mode;

        notifyObservers();
    }

    public ProgramManager getProgramManager() {
        return programManager;
    }

    public MementoCaretaker getMementoCaretaker() {
        return mementoCaretaker;
    }
}
