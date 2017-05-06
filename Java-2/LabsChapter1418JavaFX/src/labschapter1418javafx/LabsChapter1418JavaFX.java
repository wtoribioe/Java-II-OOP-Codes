/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1418javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LabsChapter1418JavaFX extends Application {
@Override
    public void start(Stage primaryStage) {
        //Create a scene and place it in the stage
        Pane pane =  new Pane();
        
        //Create rectangle and add to the pane
        Rectangle r1 = new Rectangle(25,10,60,30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        pane.getChildren().add(new Text(10,27,"r1"));
        pane.getChildren().add(r1);
        
        Rectangle r2 = new Rectangle(25,50,60,30);
        pane.getChildren().add(new Text(10,67,"r2"));
        pane.getChildren().add(r2);
        
        Rectangle r3 = new Rectangle(25,90,60,30);
        r3.setArcWidth(15);
        r3.setArcHeight(25);
        pane.getChildren().add(new Text(10,107,"r3"));
        pane.getChildren().add(r3);
        
        for (int i = 0; i < 4; i++) {
            Rectangle r = new Rectangle(100,50,100,30);
            r.setRotate(i * 360 / 8);
            r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            r.setFill(Color.WHITE);
            pane.getChildren().add(r);
        }
        //Create scene and place it in the the stage
        Scene scene = new Scene(pane,250,250);
        primaryStage.setTitle("ShowRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    /*The main method is only needed for the IDE with limited JavaFX support. 
    No needed for running from he command line */
    public static void main(String[] args) {
        Application.launch(args);
   }
}