package com.ptrml.rpncalc;

import com.ptrml.rpncalc.Observe.Observed;
import com.ptrml.rpncalc.Observe.Observing;

import java.util.List;

/**
 * Created by ptrml on 2/7/2017.
 */
public class RPNDisplay implements Observed {


    private Boolean STOFlag = false;
    private Boolean RCLFlag = false;
    private Boolean RADFlag = false;
    private Boolean PROGFlag = false;
    private RPNStack stack;
    private List<Observing> observers;

    public RPNDisplay(RPNStack stack) {
        this.stack = stack;
    }


    public Boolean getSTOFlag() {
        return STOFlag;
    }

    public void setSTOFlag(Boolean STOFlag) {
        this.STOFlag = STOFlag;
    }

    public Boolean getRCLFlag() {
        return RCLFlag;
    }

    public void setRCLFlag(Boolean RCLFlag) {
        this.RCLFlag = RCLFlag;
    }

    public Boolean getRADFlag() {
        return RADFlag;
    }

    public void setRADFlag(Boolean RADFlag) {
        this.RADFlag = RADFlag;
    }

    public Boolean getPROGFlag() {
        return PROGFlag;
    }

    public void setPROGFlag(Boolean PROGFlag) {
        this.PROGFlag = PROGFlag;
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
}
