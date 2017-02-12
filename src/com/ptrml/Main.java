package com.ptrml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
                "JavaFXGUI.fxml"),bundle);
        Parent root = loader.load();
        primaryStage.setTitle("RPNCalc");
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("root.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();


    }
}
