/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1504javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LabsChapter1504JavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btNew = new Button("New");
        Button btOpen = new Button("Open");
        Button btSave = new Button("Save");
        Button btPrint = new Button("Print");
        hBox.getChildren().addAll(btNew,btOpen,btSave,btPrint);
        
        //Create and register the handler using annonimous inner clases
        btNew.setOnAction(new EventHandler<ActionEvent>() {
        @Override //override handle method
        public void handle(ActionEvent e) {
            System.out.println("Process New");
          }
        });
        //Create and register the handler
        btOpen.setOnAction(new EventHandler<ActionEvent>() {
        @Override //override handle method
        public void handle(ActionEvent e) {
            System.out.println("Process Open");
          }
        });
        //Create and register the handler
        btSave.setOnAction(new EventHandler<ActionEvent>() {
        @Override //override handle method
        public void handle(ActionEvent e) {
            System.out.println("Process Save");
          }
        });
        //Create and register the handler
        btPrint.setOnAction(new EventHandler<ActionEvent>() {
        @Override //override handle method
        public void handle(ActionEvent e) {
            System.out.println("Process Print");
          }
        });
        //Create the scene and place it in the stage
        Scene scene = new Scene(hBox, 300, 250);
        primaryStage.setTitle("AnonymousHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
