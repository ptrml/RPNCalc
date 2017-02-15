package com.ptrml.JavaFXGUI;

import com.ptrml.GUIController;
import com.ptrml.rpncalc.CharLegend;
import com.ptrml.rpncalc.Observe.Observing;
import com.ptrml.rpncalc.RPNCalc;
import com.ptrml.rpncalc.RPNCore;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * Controls GUI
 */
public class JavaFXController extends GUIController {

    @FXML
    private Label Stack_X;
    @FXML
    private Label Stack_Y;
    @FXML
    private Label Stack_Z;
    @FXML
    private Label Stack_T;

    @FXML
    private Label PROGFlag;
    @FXML
    private Label RADFlag;
    @FXML
    private Label GRADFlag;
    @FXML
    private Label DEGFlag;
    @FXML
    private Label STOFlag;
    @FXML
    private Label RCLFlag;
    @FXML
    private Label INVFlag;


    public JavaFXController() {

    }

    @FXML
    private void initialize(){

        this.register();
    }



    @Override
    public void notifyObserving() {
        Double[] stack = this.core.getStack().getCurrentStack();

        Double opacity[] = {0.1,0.9};


        if(this.core.getNumComposer().isEmpty())
        {
            Stack_X.setText(stack[0].toString());
            Stack_Y.setText(stack[1].toString());
            Stack_Z.setText(stack[2].toString());
            Stack_T.setText(stack[3].toString());
        }
        else
        {
            Stack_X.setText(this.core.getNumComposer().getValue());
            Stack_Y.setText(stack[0].toString());
            Stack_Z.setText(stack[1].toString());
            Stack_T.setText(stack[2].toString());
        }

        PROGFlag.setOpacity(opacity[this.core.getPROGFlag() ? 1 : 0]);

        RADFlag.setOpacity(opacity[(this.core.getTrigMode() == CharLegend.getInstance().MODE_RAD) ? 1 : 0]);
        GRADFlag.setOpacity(opacity[(this.core.getTrigMode() == CharLegend.getInstance().MODE_GRAD) ? 1 : 0]);
        DEGFlag.setOpacity(opacity[(this.core.getTrigMode() == CharLegend.getInstance().MODE_DEG) ? 1 : 0]);
        STOFlag.setOpacity(opacity[(this.core.getState() == CharLegend.getInstance().STATE_STO) ? 1 : 0]);
        RCLFlag.setOpacity(opacity[(this.core.getState() == CharLegend.getInstance().STATE_RCL) ? 1 : 0]);
        INVFlag.setOpacity(opacity[(this.core.getState() == CharLegend.getInstance().STATE_INV) ? 1 : 0]);

    }


    public void processInput(ActionEvent actionEvent) {

        Character input = ((Button)actionEvent.getSource()).getId().charAt(0);

        try {
            rpnCalc.input(input);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public RPNCalc getCalculator()
    {
        return rpnCalc;
    }
}
