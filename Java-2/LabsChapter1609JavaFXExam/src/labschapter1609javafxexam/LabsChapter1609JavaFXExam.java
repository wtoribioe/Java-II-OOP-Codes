/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1609javafxexam;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LabsChapter1609JavaFXExam extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Button bt1 = new Button("Java1");
        Button bt2 = new Button("Java2");
        Button bt3 = new Button("Java3");
        Button bt4 = new Button("Java4");
        pane.getChildren().addAll(bt1, bt2, bt3, bt4);

        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("Test"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
        public static void main(String[] args) {
        launch(args);

    }

}