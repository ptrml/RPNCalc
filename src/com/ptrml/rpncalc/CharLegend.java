package com.ptrml.rpncalc;


import com.ptrml.Main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Gi cuva site vrednosti na kopcinjata/identifikatorite na komandite
 */
public class CharLegend {

    static CharLegend instance;
    Properties prop;


    public CharLegend() {
        prop = new Properties();
        InputStream input = null;

        try {

            String filename = "com/ptrml/rpncalc/resources.properties";
            input = Main.class.getClassLoader().getResourceAsStream(filename);
            // load a properties file
            prop.load(input);

            setVals();

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static CharLegend getInstance()
    {
        if(instance == null) {
            synchronized (CharLegend.class)
            {
                instance = new CharLegend();
            }
        }
        return instance;
    };

    public Character ONE;//(prop.getProperty("ONE")).charAt(0);//'1';
    public Character TWO;//(prop.getProperty("TWO")).charAt(0);//'2';
    public Character THREE;//(prop.getProperty("THREE")).charAt(0);//'3';
    public Character FOUR;//(prop.getProperty("FOUR")).charAt(0);//'4';
    public Character FIVE;//(prop.getProperty("FIVE")).charAt(0);//'5';
    public Character SIX;//(prop.getProperty("SIX")).charAt(0);//'6';
    public Character SEVEN;//(prop.getProperty("SEVEN")).charAt(0);//'7';
    public Character EIGHT;//(prop.getProperty("EIGHT")).charAt(0);//'8';
    public Character NINE;//(prop.getProperty("NINE")).charAt(0);//'9';
    public Character ZERO;//(prop.getProperty("ZERO")).charAt(0);//'0';
    public Character ENTER;//(prop.getProperty("ENTER")).charAt(0);//'=';
    public Character ADD;//(prop.getProperty("ADD")).charAt(0);//'+';
    public Character SUBTRACT;//(prop.getProperty("SUBTRACT")).charAt(0);//'-';
    public Character MULTIPLY;//(prop.getProperty("MULTIPLY")).charAt(0);//'*';
    public Character DIVIDE;//(prop.getProperty("DIVIDE")).charAt(0);//'/';
    public Character CHS;//(prop.getProperty("CHS")).charAt(0);//'C';
    public Character DROP;//(prop.getProperty("DROP")).charAt(0);//'D';
    public Character SWAP;//(prop.getProperty("SWAP")).charAt(0);//'W';
    public Character UNDO;//(prop.getProperty("UNDO")).charAt(0);//'U';
    public Character REDO;//(prop.getProperty("REDO")).charAt(0);//'R';
    public Character STO;//(prop.getProperty("STO")).charAt(0);//'S';
    public Character RCL;//(prop.getProperty("RCL")).charAt(0);//'L';
    public Character PROG;//(prop.getProperty("PROG")).charAt(0);//'P';
    public Character EXE;//(prop.getProperty("EXE")).charAt(0);//'E';
    public Character SIN;//(prop.getProperty("SIN")).charAt(0);//'!';
    public Character COS;//(prop.getProperty("COS")).charAt(0);//'@';
    public Character TAN;//(prop.getProperty("TAN")).charAt(0);//'#';
    public Character ASIN;//(prop.getProperty("ASIN")).charAt(0);//'$';
    public Character ACOS;//(prop.getProperty("ACOS")).charAt(0);//'%';
    public Character ATAN;//(prop.getProperty("ATAN")).charAt(0);//'^';

    public Character AC;//(prop.getProperty("AC")).charAt(0);//'|';


    public Character DRG;//(prop.getProperty("DRG")).charAt(0);//'?';
    public Character INV;//(prop.getProperty("INV")).charAt(0);//':';
    public Character POINT;//(prop.getProperty("POINT")).charAt(0);//'.';


    public Character STATE_NORMAL;//(prop.getProperty("STATE_NORMAL")).charAt(0);//'n';
    public Character STATE_INV;//(prop.getProperty("STATE_INV")).charAt(0);//'i';
    public Character STATE_STO;//(prop.getProperty("STATE_STO")).charAt(0);//'s';
    public Character STATE_RCL;//(prop.getProperty("STATE_RCL")).charAt(0);//'r';

    public Character MODE_DEG;//(prop.getProperty("MODE_DEG")).charAt(0);//'d';
    public Character MODE_GRAD;//(prop.getProperty("MODE_GRAD")).charAt(0);//'g';
    public Character MODE_RAD;//(prop.getProperty("MODE_RAD")).charAt(0);//'r';



    private void setVals()
    {

        STATE_NORMAL = 'n';
        STATE_INV = 'i';
        STATE_STO = 's';
        STATE_RCL = 'r';

        MODE_DEG = 'd';
        MODE_GRAD = 'g';
        MODE_RAD = 'r';

        ONE = (prop.getProperty("ONE")).charAt(0);//'1';
        TWO = (prop.getProperty("TWO")).charAt(0);//'2';
        THREE = (prop.getProperty("THREE")).charAt(0);//'3';
        FOUR = (prop.getProperty("FOUR")).charAt(0);//'4';
        FIVE = (prop.getProperty("FIVE")).charAt(0);//'5';
        SIX = (prop.getProperty("SIX")).charAt(0);//'6';
        SEVEN = (prop.getProperty("SEVEN")).charAt(0);//'7';
        EIGHT = (prop.getProperty("EIGHT")).charAt(0);//'8';
        NINE = (prop.getProperty("NINE")).charAt(0);//'9';
        ZERO = (prop.getProperty("ZERO")).charAt(0);//'0';
        ENTER = (prop.getProperty("ENTER")).charAt(0);//'=';
        ADD = (prop.getProperty("ADD")).charAt(0);//'+';
        SUBTRACT = (prop.getProperty("SUBTRACT")).charAt(0);//'-';
        MULTIPLY = (prop.getProperty("MULTIPLY")).charAt(0);//'*';
        DIVIDE = (prop.getProperty("DIVIDE")).charAt(0);//'/';
        CHS = (prop.getProperty("CHS")).charAt(0);//'C';
        DROP = (prop.getProperty("DROP")).charAt(0);//'D';
        SWAP = (prop.getProperty("SWAP")).charAt(0);//'W';
        UNDO = (prop.getProperty("UNDO")).charAt(0);//'U';
        REDO = (prop.getProperty("REDO")).charAt(0);//'R';
        STO = (prop.getProperty("STO")).charAt(0);//'S';
        RCL = (prop.getProperty("RCL")).charAt(0);//'L';
        PROG = (prop.getProperty("PROG")).charAt(0);//'P';
        EXE = (prop.getProperty("EXE")).charAt(0);//'E';
        SIN = (prop.getProperty("SIN")).charAt(0);//'!';
        COS = (prop.getProperty("COS")).charAt(0);//'@';
        TAN = (prop.getProperty("TAN")).charAt(0);//'#';
        ASIN = (prop.getProperty("ASIN")).charAt(0);//'$';
        ACOS = (prop.getProperty("ACOS")).charAt(0);//'%';
        ATAN = (prop.getProperty("ATAN")).charAt(0);//'^';

        AC = (prop.getProperty("AC")).charAt(0);//'|';


        DRG = (prop.getProperty("DRG")).charAt(0);//'?';
        INV = (prop.getProperty("INV")).charAt(0);//':';
        POINT = (prop.getProperty("POINT")).charAt(0);//'.';

    }

}

