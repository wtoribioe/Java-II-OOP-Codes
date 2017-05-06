/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1410javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LabsChapter1410JavaFX extends Application {
@Override
    public void start(Stage primaryStage) {
        //Create a pane to hold the image views.
        String url = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQMoGVWUL-8WEPLJq5sukbrX7KL1kIFJ-3mHYApI1BtMWFJTFJs";
        
        Pane pane = new HBox(10); //Horizontal Box to place obhects horizontally in a row
        pane.setPadding(new Insets(5,5,5,5));  //Set spaces right-left-top and bottom
        //Create the first image object and add it to the pane-hBox
        
        Image image = new Image(url); //Create the image file using the URL and add it to the pane-hBox
        pane.getChildren().add(new ImageView(image));  
        
        //Create the second image object and add it to the pane-hBox
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(250);
        imageView2.setFitWidth(250);
        pane.getChildren().add(imageView2);
        
        //Create a third image object and add it to the pane-hBox
        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);
        
        //Create a scene an place it in the stage
        Scene scene = new Scene(pane,750,350);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    }
}
