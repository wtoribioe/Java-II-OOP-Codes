/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1416javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;


public class LabsChapter1416JavaFX extends Application {
@Override
    public void start(Stage primaryStage) {
    //Create a pane to hold the text
    Pane pane = new Pane();
    pane.setPadding(new Insets(5,5,5,5));
    Text text1 = new Text(20,20, "Programming is fun");
    text1.setFont(Font.font("courier", FontWeight.BOLD, FontPosture.ITALIC,15));
    pane.getChildren().add(text1);
    
    Text text2 = new Text(60,60, "Programming is fun\nDisplay text");
    pane.getChildren().add(text2);
    
    Text text3 = new Text(10,100, "Programming is fun\nDisplay text");
    text3.setFill(Color.RED);
    text3.setUnderline(true);
    text3.setStrikethrough(true);
    pane.getChildren().add(text3);
    
    //Create a scene and place it in the stage
    Scene scene = new Scene(pane,250,250);
    primaryStage.setTitle("ShowText");
    primaryStage.setScene(scene);
    primaryStage.show();
    }
    
    /*The main method is only needed for the IDE with limited JavaFX support. 
    No needed for running from he command line */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
