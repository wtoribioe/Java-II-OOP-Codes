/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1411javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LabsChapter1411JavaFX extends Application {
@Override
    public void start(Stage primaryStage) {
       //Create a pane and set its properties
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(21,22,23,24)); //Spaces from the left, right, top and botton border of the pane
        pane.setHgap(10); //Space between the nodes (Labels and Textfields)
        pane.setVgap(10); //Space between the nodes (Labels and Textfields)
        
        //Place nodes in the pane row layout
        pane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("Midle Name:"));
        
        TextField tfMi = new TextField();  //Second row 
        tfMi.setPrefColumnCount(11); //size of the textbox 
        pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
        
        //Create a scene and place it in the stage
        Scene scene = new Scene(pane,550,175); //Define the size of the canva into the window 
        primaryStage.setTitle("ShowFlowPane");
        primaryStage.setScene(scene);
        primaryStage.show(); 
        
    }
    //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    } 
}
