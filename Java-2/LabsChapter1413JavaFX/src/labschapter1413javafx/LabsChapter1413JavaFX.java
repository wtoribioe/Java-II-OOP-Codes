/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1413javafx;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class LabsChapter1413JavaFX extends Application {
@Override
    public void start(Stage primaryStage) {
    //Create a GridPanel and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        
        //Place node in the pane
        pane.add(new Label("Frist Name:"),0,0);
        pane.add(new TextField(),1,0);
        pane.add(new Label("MI:"),0,1);
        pane.add(new TextField(),1,1);
        pane.add(new Label("Last Name:"),0,2);
        pane.add(new TextField(),1,2);
        Button btAdd = new Button("Add Name");
        pane.add(btAdd,1,3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        
        //Create scene and place it in the stage
        Scene scene = new Scene(pane,250,250);
        primaryStage.setTitle("ShowGridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    }
}
