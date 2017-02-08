package com.ptrml;

import com.ptrml.rpncalc.Controller;
import com.ptrml.rpncalc.RPNCalc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {

    public static void main(String[] args) {
	// write your code here

        launch(args);


    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        ResourceBundle bundle = ResourceBundle.getBundle("com/ptrml/resources");

        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "RPNCalc.fxml"),bundle);
        Parent root = loader.load();
        primaryStage.setTitle("RPNCalc");
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("root.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
