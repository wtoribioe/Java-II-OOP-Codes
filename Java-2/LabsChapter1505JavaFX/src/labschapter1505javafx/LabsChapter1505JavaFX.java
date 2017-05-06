/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1505javafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LabsChapter1505JavaFX extends Application {
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
        
        //Create and register the handler using Lambda
        btNew.setOnAction((ActionEvent e) -> {
            System.out.println("Process New");
        });
        //Create and register the handler
        btOpen.setOnAction((e) -> {
            System.out.println("Process Open");
        });
        //Create and register the handler
        btSave.setOnAction(e -> {
            System.out.println("Process Save");
        });
        //Create and register the handler
        btPrint.setOnAction(e -> System.out.println("Process Print"));
     
        //Create the scene and place it in the stage
        Scene scene = new Scene(hBox, 300, 250);
        primaryStage.setTitle("LambdaHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
