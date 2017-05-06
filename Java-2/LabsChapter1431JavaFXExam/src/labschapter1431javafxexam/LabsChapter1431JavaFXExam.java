/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1431javafxexam;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class LabsChapter1431JavaFXExam extends Application {
@Override // Override the start method in the Application class

    public void start(Stage primaryStage) {

        HBox pane = new HBox(5);
        Circle circle = new Circle(50, 200, 200);
        pane.getChildren().addAll(circle); //IllegalArgumentException: Children: duplicate children added: parent = HBox@68512492

        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        pane.getChildren().addAll(circle);
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Test"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
}
/**
* The main method is only needed for the IDE with limited
* JavaFX support. Not needed for running from the command line.
*/
    public static void main(String[] args) {

    launch(args);

    }

}