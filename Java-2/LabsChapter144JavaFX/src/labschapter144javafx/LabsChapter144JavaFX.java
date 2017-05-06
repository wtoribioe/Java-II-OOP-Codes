/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter144javafx;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class LabsChapter144JavaFX extends Application{
@Override
    public  void start(Stage primaryStage) {
        //Create a scene and place a button in the scene
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("Ok"));
        Scene scene = new Scene(pane,250,250);
        
        primaryStage.setTitle("Button in a pane");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
       //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    }
}
