/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labschapter2006collections;

import javafx.scene.paint.Color;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LabsChapter2006Collections extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       MultipleBallPane ballPane = new MultipleBallPane();
       ballPane.setStyle("-fx-border-color: yellow");
       
       Button btAdd = new Button("+");
       Button btSubtract = new Button("-");
       HBox hBox = new HBox(10);  // (10) Space between button
       hBox.getChildren().addAll(btAdd,btSubtract);
       hBox.setAlignment(Pos.CENTER);
       
       //Add or remove ball
       btAdd.setOnAction(e -> ballPane.add());
       btSubtract.setOnAction(e -> ballPane.subtract());
       
       //Pause and resume action
       ballPane.setOnMousePressed(e -> ballPane.pause());
       ballPane.setOnMouseReleased(e -> ballPane.play());
       
       //Use a scroll bar to control animation speed
       ScrollBar sbSpeed = new ScrollBar();
       sbSpeed.setMax(20);
       sbSpeed.setValue(10);
       ballPane.rateProperty().bind(sbSpeed.valueProperty());
       
       BorderPane pane = new BorderPane();
       pane.setCenter(ballPane);
       pane.setTop(sbSpeed);
       pane.setBottom(hBox);
       
       //Create scene and place the pane in the scene   
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Multiple Bounce Balls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    private class MultipleBallPane extends Pane {
        private Timeline animation;
        
        public MultipleBallPane() {
            //Create an animation for moving the ball
            animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play();
        }
        public void add() {
            Color color = new Color(Math.random(),
            Math.random(), Math.random(), 0.5);
            getChildren().add(new Ball(30,30,20,color));
        }
        public void subtract() {
            if (getChildren().size() > 0) {
                getChildren().remove(getChildren().size() -1);
            }
        }
        public void play() {
            animation.play();
        }
        public void pause() {
            animation.pause();
        }
        public void increaseSpeed() {
            animation.setRate(animation.getRate() + 0.1);
        }
      
        public void decreaseSpeed() {
            animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
        }
        public DoubleProperty rateProperty() {
            return animation.rateProperty();
        }
        public void moveBall() {
            for (Node node: this.getChildren()) {
            Ball ball = (Ball)node;
            
            //Check boundaries
            if (ball.getCenterX() < ball.getRadius() ||
                    ball.getCenterX() > getWidth() - ball.getRadius()) {
                ball.dx *= -1;
            }
            if (ball.getCenterY() <  ball.getRadius() ||
                    ball.getCenterY() > getHeight() - ball.getRadius()) {
                ball.dy *= -1;
            }
            //Adjust ball position
            ball.setCenterX(ball.dx + ball.getCenterX());
            ball.setCenterY(ball.dy + ball.getCenterY()); 
       }
    }
}   
    class Ball extends Circle {
        private double dx = 1, dy = 1;
        
        Ball(double x, double y, double radius, Color color) {
            super(x,y,radius);
            setFill(color);
        }
    }
}


