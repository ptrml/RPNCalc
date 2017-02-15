package com.ptrml.rpncalc.TrigConverter;

import com.ptrml.rpncalc.CharLegend;

/**
 * Created by ptrml on 2/15/2017.
 */
public class TrigFactory {

    static TrigFactory instance;
    public TrigFactory() {}

    public static TrigFactory getInstance(){
        if(instance == null)
            instance = new TrigFactory();

        return instance;
    }

    public TrigConverter getConverter(Character mode) throws Exception {
        if(mode == CharLegend.getInstance().MODE_DEG)
            return new DegConverter();
        else if (mode == CharLegend.getInstance().MODE_GRAD)
            return new GradConverter();
        else if (mode == CharLegend.getInstance().MODE_RAD)
            return new RadConverter();
        else
            throw new Exception("Unknown trig mode");
    }
}
