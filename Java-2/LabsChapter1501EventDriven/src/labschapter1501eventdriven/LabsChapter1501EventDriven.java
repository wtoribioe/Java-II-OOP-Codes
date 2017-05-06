/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1501eventdriven;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LabsChapter1501EventDriven extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOk = new Button("Ok");
        Button btCancel = new Button("Cancel");
        OKHandlerClass handler1 = new OKHandlerClass();
        btOk.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        pane.getChildren().addAll(btOk,btCancel);
         
        Scene scene = new Scene(pane,300,300);
        
        primaryStage.setTitle("HandleEvent!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class OKHandlerClass implements EventHandler<ActionEvent> {
@Override
public void handle(ActionEvent e) {
    System.out.println("Ok button clicked");
  }
}
class CancelHandlerClass implements EventHandler<ActionEvent> {
@Override
public void handle(ActionEvent e) {
    System.out.println("Cancel button clicked");
  }
}