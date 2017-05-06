/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter142javafx;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LabsChapter142JavaFX extends Application{
    @Override
    public void start(Stage primaryStage) {
        // Create scene and place button in the scene
        Scene scene = new Scene(new Button("Ok"), 400,450);
        primaryStage.setTitle("Primary Stage");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Stage stage2 = new Stage(); //Create a new stage
        stage2.setTitle("Secondary Stage");
        stage2.setScene(new Scene(new Button("New Stage"), 400, 450)); 
        stage2.show();
    }
    //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    }
}