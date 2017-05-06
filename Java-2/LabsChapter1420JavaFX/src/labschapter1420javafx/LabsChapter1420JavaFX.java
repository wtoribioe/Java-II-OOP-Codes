/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1420javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LabsChapter1420JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane canvas = new Pane();
        
        Arc arc1 = new Arc(150,100,80,80,30,35);
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);
        canvas.getChildren().add(new Text(210,40,"arcl: round"));
        canvas.getChildren().add(arc1);
        
        Arc arc2 = new Arc(150,100,80,80,30 + 90,35);
        arc2.setFill(Color.WHITE);
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.BLACK);
        canvas.getChildren().add(new Text(20,40,"arc2: round"));
        canvas.getChildren().add(arc2);
        
        Arc arc3 = new Arc(150,100,80,80,30 + 180,35);
        arc3.setFill(Color.WHITE);
        arc3.setType(ArcType.CHORD);
        arc3.setStroke(Color.BLACK);
        canvas.getChildren().add(new Text(20,700,"arc3: round"));
        canvas.getChildren().add(arc3);
        
        Arc arc4 = new Arc(150,100,80,80,30 + 270,35);
        arc4.setFill(Color.BLACK);
        arc4.setType(ArcType.CHORD);
        arc3.setStroke(Color.BLACK);
        canvas.getChildren().add(new Text(210,170,"arc4: round"));
        canvas.getChildren().add(arc4);
        Scene scene = new Scene(canvas, 300, 250);
        
        primaryStage.setTitle("ShowArc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
