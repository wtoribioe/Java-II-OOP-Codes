/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1417jafafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class LabsChapter1417JafaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
        Pane canvas = new Pane();
        for (int i = 0; i < 16; i++) {
            Ellipse elip = new Ellipse(150,100,100,50);
            elip.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            elip.setFill(Color.WHITE);
            canvas.getChildren().add(elip);
        }
        
        Scene scene = new Scene(canvas, 300, 250);
        
        primaryStage.setTitle("ShowElipse!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
