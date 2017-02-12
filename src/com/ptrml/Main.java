package com.ptrml;

import com.ptrml.JavaFXGUI.JavaFXApp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main {

    static AppGUI appGUI;

    public static void main(String[] args) {

        appGUI = new JavaFXApp();
        appGUI.startGUI(args);
    }



}
