package com.ptrml.JavaFXGUI;

import com.ptrml.AppGUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class JavaFXApp extends Application implements AppGUI {


    @Override
    public void start(Stage primaryStage) throws Exception {

        ResourceBundle bundle = ResourceBundle.getBundle("com/ptrml/rpncalc/resources");

        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "JavaFXGUI.fxml"),bundle);
        Parent root = loader.load();
        primaryStage.setTitle("RPNCalc");
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("root.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();


    }

    @Override
    public void startGUI(String[] args) {
        launch(args);
    }
}
