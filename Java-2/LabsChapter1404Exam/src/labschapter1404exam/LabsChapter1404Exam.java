/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter1404exam;

import javafx.application.Application;
import javafx.stage.Stage;

public class LabsChapter1404Exam extends Application {

    public LabsChapter1404Exam() {

        System.out.println("Test constructor is invoked.");

    }

        @Override // Override the start method in the Application class

    public void start(Stage primaryStage) {

        System.out.println("start method is invoked.");

    }

    public static void main(String[] args) {

        System.out.println("launch application.");

        Application.launch(args);

    }

}