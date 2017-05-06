/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1421javafxexam;

import java.awt.Image;
import java.awt.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LabsChapter1421JavaFXExam extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
    // Create a pane to hold the image views

    Pane pane = new HBox(10);
    pane.setPadding(new Insets(5, 5, 5, 5));
    Image image = new Image("www.cs.armstrong.edu/liang/image/us.gif");  // Need to replace Image("www.cs.armstrong.edu/liang/image/us.gif"); 
    pane.getChildren().addAll(new ImageView(image), new ImageView(image));


    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowImage"); // Set the stage title
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