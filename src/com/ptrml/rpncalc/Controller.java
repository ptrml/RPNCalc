package com.ptrml.rpncalc;

import com.ptrml.rpncalc.Observe.Observing;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller implements Observing{

    RPNCalc calculator;

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
    private Label STOFlag;
    @FXML
    private Label RCLFLag;


    @FXML
    public String ADD;

    public Controller() {

    }

    @FXML
    private void initialize(){

        calculator = new RPNCalc();
        calculator.getDisplay().registerObserver(this);
        this.notifyObserving();
    }



    @Override
    public void notifyObserving() {
        Double[] stack = calculator.getDisplay().getStack();

        Double opacity[] = {0.1,0.9};


        Stack_X.setText(stack[0].toString());
        Stack_Y.setText(stack[1].toString());
        Stack_Z.setText(stack[2].toString());
        Stack_T.setText(stack[3].toString());

        PROGFlag.setOpacity(opacity[calculator.getDisplay().getPROGFlag() ? 1 : 0]);
        RADFlag.setOpacity(opacity[calculator.getDisplay().getRADFlag() ? 1 : 0]);
        STOFlag.setOpacity(opacity[calculator.getDisplay().getSTOFlag() ? 1 : 0]);
        RCLFLag.setOpacity(opacity[calculator.getDisplay().getRCLFlag() ? 1 : 0]);

    }

    @Override
    public void unregister() {
        //no need
    }

    public void processInput(ActionEvent actionEvent) {

        Character input = ((Button)actionEvent.getSource()).getId().charAt(0);

        try {
            calculator.input(input);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public RPNCalc getCalculator()
    {
        return calculator;
    }
}