/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1507javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LabsChapter1507JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
        Text text = new Text(20,20,"Programming is fun");
        pane.getChildren().addAll(text);
        text.setOnMouseDragged(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
        });
        
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("MouseEvenDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
