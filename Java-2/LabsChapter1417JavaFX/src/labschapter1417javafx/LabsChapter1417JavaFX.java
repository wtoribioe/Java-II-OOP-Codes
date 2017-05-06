/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1417javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LabsChapter1417JavaFX extends Application {
@Override
    public void start(Stage primaryStage) {
        //Create a scene and place it in the stage
        Scene scene = new Scene(new LinePane(),200,200);
        primaryStage.setTitle("Show line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /*The main method is only needed for the IDE with limited JavaFX support. 
    No needed for running from he command line */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
    class LinePane extends Pane {
        public LinePane() {
            Line line1 = new Line(10,10,10,10);
            line1.endXProperty().bind(widthProperty().subtract(10));
            line1.endYProperty().bind(heightProperty().subtract(10));
            line1.setStrokeWidth(5);
            line1.setStroke(Color.GREEN);
            getChildren().add(line1);
            
            Line line2 = new Line(10,10,10,10);
            line2.startXProperty().bind(widthProperty().subtract(10));
            line2.endYProperty().bind(heightProperty().subtract(10));
            line2.setStrokeWidth(5);
            line2.setStroke(Color.GREEN);
            getChildren().add(line2);
  
    }
  }