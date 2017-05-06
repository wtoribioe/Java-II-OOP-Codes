import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;


public class LabsChapter146JavaFX extends Application{
@Override
    public void start(Stage primaryStage) {
        //Create pane to hold the circle
        Pane pane = new Pane();
        
        //Create a scene and 
        Scene scene = new Scene(pane,200,200);
        
        //Create a circle and set its properties
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.YELLOW);
        pane.getChildren().add(circle);
        
        //Place the scene in the stage
        primaryStage.setTitle("ShowCircleCentered");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        Application.launch(args);
    }
}
