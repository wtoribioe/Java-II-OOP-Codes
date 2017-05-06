/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1415javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class LabsChapter1415JavaFX extends Application {
@Override
    public void start(Stage primaryStage) {
    //Create a border pane
        BorderPane pane = new BorderPane();
        pane.setTop(getHBox());
        pane.setLeft(getVBox());
        
    //Create a scene and place in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowHBoxVBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }   
    private HBox getHBox() {
        String url = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQMoGVWUL-8WEPLJq5sukbrX7KL1kIFJ-3mHYApI1BtMWFJTFJs";
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        ImageView imageView = new ImageView(new Image(url));
        hBox.getChildren().add(imageView);
        return hBox;
    }
        private VBox getVBox() {
            VBox vBox = new VBox(15);
            vBox.setPadding(new Insets(15,5,5,5));
            vBox.getChildren().add(new Label("Courses"));
            
            Label[] courses = {new Label("CSCI 1301"),new Label("CSCI 1302"),new Label("CSCI 1303"),new Label("CSCI 1304")};
            for (Label course: courses) {
                VBox.setMargin(course, new Insets(0,0,0,15));
                vBox.getChildren().add(course);
            }
            return vBox;
        }
        //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    }
} 