/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1421javafx;

import javafx.scene.shape.Polygon;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LabsChapter1421JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane canvas = new Pane();
        Polygon polygon = new Polygon();
        canvas.getChildren().add(polygon);
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> list = polygon.getPoints();
        
        final double WIDTH = 200, HEIGHT = 200;
        double centerX = WIDTH / 2, centerY = HEIGHT / 2;
        double radius = Math.min(WIDTH, HEIGHT) * 0.4;
       
        for (int i = 0; i < 6; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI /6));
            list.add(centerY + radius * Math.sin(2 * i * Math.PI /6));
        }
        Scene scene = new Scene(canvas, 300, 250);
        primaryStage.setTitle("ShowPolygon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
