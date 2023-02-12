package com.stevengodson.java19doit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        Group g = new Group();
        GridPane grid = new GridPane();
        grid.setMinWidth(600);
        grid.setMinHeight(400);
        grid.setGridLinesVisible(false);
        grid.setVgap(5);
        grid.setHgap(20);

        TableView table = new TableView();
        table.setMinHeight(300);
        table.setMinWidth(550);

        TableColumn col1 = new TableColumn<>("Priority");
        TableColumn col2 = new TableColumn<>("Description");
        TableColumn col3 = new TableColumn<>("Progress");
        table.getColumns().addAll(col1,col2,col3);

        GridPane.setConstraints(table,1,1,3,1);

        TextField taskName = new TextField();
        taskName.setPromptText("Enter task name");
        taskName.setText("Default Task");
        taskName.setMinWidth(300);
        GridPane.setConstraints(taskName,2,2);

        ComboBox priority= new ComboBox();
        priority.getItems().addAll("High", "Medium", "Low");
        priority.setPromptText("Enter Priority");
        GridPane.setConstraints(priority,1,2);

        Button addButton = new Button("Add Task");
        addButton.setMinWidth(100);
        GridPane.setConstraints(addButton,3,2);

        Button cancelButton = new Button("Cancel Task");
        cancelButton.setMinWidth(100);
        GridPane.setConstraints(cancelButton,3,3);

        HBox progressArea = new HBox();
        progressArea.getChildren().addAll(
                new Label("Progress"),
                new Spinner<Integer>(0,100,0),
                new CheckBox("Completed"));
        progressArea.setAlignment(Pos.CENTER_RIGHT);
        progressArea.setSpacing(10);
        GridPane.setConstraints(progressArea,1,3,2,1);


        grid.getChildren().addAll(table,taskName,priority,addButton,cancelButton,progressArea);

        Scene scene = new Scene(grid, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Do IT...");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}