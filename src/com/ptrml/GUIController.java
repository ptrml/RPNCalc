package com.ptrml;

import com.ptrml.rpncalc.Observe.Observing;
import com.ptrml.rpncalc.RPNCalc;

/**
 * Created by ptrml on 2/12/2017.
 */
public abstract class GUIController implements Observing {

    protected RPNCalc rpnCalc;

    protected void register()
    {
        rpnCalc = new RPNCalc();
        rpnCalc.getCore().registerObserver(this);
        this.notifyObserving();
    }


    @Override
    public void unregister() {
        rpnCalc.getCore().unregisterObserver(this);
    }
}
