/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter145javafx;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;


public class LabsChapter145JavaFX extends Application{
@Override
    public void start(Stage primaryStage) {
        //Create a circle and set its properties
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.YELLOW);
        
        //Create pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        
        //Create a scene and place it in the stage
        Scene scene = new Scene(pane,200,200);
        primaryStage.setTitle("ShowCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
        //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    }
}
