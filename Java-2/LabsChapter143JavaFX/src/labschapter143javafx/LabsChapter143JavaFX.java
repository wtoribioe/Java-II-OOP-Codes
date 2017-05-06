/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter143javafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class LabsChapter143JavaFX extends Application{
    public LabsChapter143JavaFX() {
        System.out.println("Test constructor is invoked");
    }
    @Override
    public void start(Stage primryStage) {
        System.out.println("Start method is invoked");
    }
     //The main method is only needed for the IDE with limited JavaFX support. No needed for running from he command line
    public static void main(String[] args) {
        System.out.println("Launch the aplication method is invoked");
        Application.launch(args);
    }
}
