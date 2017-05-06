/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1422javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LabsChapter1422JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        ClockPane clock = new ClockPane();
        
        String timeString = clock.getHour() + ":" + clock.getMinute() +
                ":" + clock.getSecond();
        
        Label lblCurrentTime = new Label(timeString);
        
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
        
        Scene scene = new Scene(pane, 300, 300);
        
        primaryStage.setTitle("DisplayClock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
