/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter141javafx;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LabsChapter141JavaFX extends Application{
    @Override // Override the start methdo in the Application class
    public void start(Stage primaryStage) {
    //Create a scene and place  a button in the scene
        Button btOk = new Button("Ok");
        
        Scene scene = new Scene(btOk, 200, 250);
        primaryStage.setTitle("MyJavaFx"); //Set the stage title
        primaryStage.setScene(scene); //Place the scene in the stage
        primaryStage.show(); //Display the stage
    }
    //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    }
}
