/* *****************************************************************
 *
 * *****************************************************************
 *
 *
 * *****************************************************************
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    HBox pane = new HBox(30);
    pane.setAlignment(Pos.CENTER);
    
    Button btOK = new Button("OK");  // create two buttons btOK and btCancel
    Button btCancel = new Button("Cancel");  // these are even source objects
    
    // Create instances of OKHandlerClass and CancelHandlerClass
    // Register the EventHandlers with the event source object
    OKHandlerClass handler1 = new OKHandlerClass();
    btOK.setOnAction(handler1);        // registered with the button btCancel
    
    CancelHandlerClass handler2 = new CancelHandlerClass();
    btCancel.setOnAction(handler2);    // registered with the button btCancel
    
    pane.getChildren().addAll(btOK, btCancel);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("HandleEvent"); // Set the stage title
    primaryStage.setScene(scene);         // Place the scene in the stage
    primaryStage.show();                  // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 

//*************Two classes that extend the EventHandler 
// When the buttons are clicked the handle(ActionEvent) is invloked
class OKHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("OK button clicked"); 
  }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Cancel button clicked");
  }
}
