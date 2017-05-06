/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter149javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.control.*;
import javafx.scene.text.*;

public class LabsChapter149JavaFX extends Application {
@Override
    public void start(Stage primaryStage) {
        //Create pane to hold circle
        Pane pane = new StackPane();
        
        //Create cricle set its properties
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(0.6, 0.6, 0.6, 1));
        pane.getChildren().add(circle);
        
        //Create a label and set its properties
        Label label = new Label("JavaFX");
        label.setFont(Font.font("Times New Roman",
        FontWeight.BOLD, FontPosture.ITALIC, 20));
        pane.getChildren().add(label);
        
        //Create scene and place it on the stage
        Scene scene = new Scene(pane,450,450);
        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
      //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    }
}
