/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1414javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class LabsChapter1414JavaFX extends Application {
@Override
    public void start(Stage primaryStage) {
    //Create Border pane
        BorderPane pane = new BorderPane();
        
    //Place nodes in the pane
        pane.setTop(new CustomPane("Top"));
        pane.setRight(new CustomPane("Right"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setLeft(new CustomPane("Left"));
        pane.setCenter(new CustomPane("Center"));
        
        //Create  a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowBorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    
   }
    //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    }
}  

//Define custom pane to hold a lable in the ccenter of the pane.
class CustomPane extends StackPane {
    public CustomPane(String title) {
        getChildren().add(new Label(title));
        setStyle("-fxborder-color: red");
        setPadding(new Insets(11.5,12.5,13.5,14.5));
    }
}
