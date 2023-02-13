package com.stevengodson.java19doit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Home extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = FXMLLoader.load(getClass().getResource("ui.fxml"));
        Scene scene = new Scene(grid, 600, 400);

        stage.setScene(scene);
        stage.setTitle("Do-It!!!");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}