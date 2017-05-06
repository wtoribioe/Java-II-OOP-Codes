/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1511javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class LabsChapter1511JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        ClockPane clock = new ClockPane();
        
        String timeString = clock.getHour() + ":" + clock.getMinute()
                + ":" + clock.getSecond();
        
        Label lblCurrentTime = new Label(timeString);
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
        
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("DisplayClock");
        primaryStage.setScene(scene);
        primaryStage.show();
       
        pane.widthProperty().addListener(ov -> clock.setW(pane.getWidth()));
        
        pane.heightProperty().addListener(ov -> clock.setH(pane.getHeight()));
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
