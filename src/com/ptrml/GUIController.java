package com.ptrml;

import com.ptrml.rpncalc.Observe.Observing;
import com.ptrml.rpncalc.RPNCalc;
import com.ptrml.rpncalc.RPNCore;

/**
 * Created by ptrml on 2/12/2017.
 */
public abstract class GUIController implements Observing {

    protected RPNCalc rpnCalc;

    @Override
    abstract public void notifyObserving();

    //Observed
    protected RPNCore core;

    protected void register()
    {
        rpnCalc = new RPNCalc();
        rpnCalc.getCore().registerObserver(this);
        this.core = rpnCalc.getCore();
        this.notifyObserving();
    }


    @Override
    public void unregister() {
        rpnCalc.getCore().unregisterObserver(this);
    }


}
