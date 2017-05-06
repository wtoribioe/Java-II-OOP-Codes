import java.io.File;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class Exercise15_011_PickFour_Refresh extends Application {
  @Override
  // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // There are two ways for shuffling. One is to use the hint in the book. 
    // The other way is to use the static shuffle method in the java.util.Collections class.
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 52; i++) {
      list.add(i);
    }
    java.util.Collections.shuffle(list);
    
    String home = System.getProperty("user.home");
    String path = home + "/images/cards/";
    
    File file5 = new File( (path + list.get(0) + ".png") );
    Image image5 = new Image(file5.toURI().toString());
    
    File file6 = new File(path + list.get(1) + ".png");
    Image image6 = new Image(file6.toURI().toString());
    
    File file7 = new File(path + list.get(2) + ".png");
    Image image7 = new Image(file7.toURI().toString());
    
    File file8 = new File(path + list.get(3) + ".png");
    Image image8 = new Image(file8.toURI().toString());
   
    HBox hBox = new HBox(5);
    hBox.setAlignment(Pos.CENTER);
    hBox.getChildren().add(new ImageView(image5));
    hBox.getChildren().add(new ImageView(image6));
    hBox.getChildren().add(new ImageView(image7));
    hBox.getChildren().add(new ImageView(image8));
    
    // Create a button
    Button btRefresh = new Button("Refresh");
    btRefresh.setOnAction(e -> {
      java.util.Collections.shuffle(list);
      hBox.getChildren().clear();
      
      File file1 = new File( (path + list.get(0) + ".png") );
      Image image1 = new Image(file1.toURI().toString());
      hBox.getChildren().add(new ImageView(image1));
      
      File file2 = new File(path + list.get(1) + ".png");
      Image image2 = new Image(file2.toURI().toString());
      hBox.getChildren().add(new ImageView(image2));
      
      File file3 = new File(path + list.get(2) + ".png");
      Image image3 = new Image(file3.toURI().toString());
      hBox.getChildren().add(new ImageView(image2));
      
      File file4 = new File(path + list.get(3) + ".png");
      Image image4 = new Image(file3.toURI().toString());
      hBox.getChildren().add(new ImageView(image3));
    });
   
    BorderPane pane = new BorderPane();
    pane.setCenter(hBox);
    pane.setBottom(btRefresh);
    BorderPane.setAlignment(btRefresh, Pos.TOP_CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 310, 150);
    primaryStage.setTitle("Exercise15_01"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 
