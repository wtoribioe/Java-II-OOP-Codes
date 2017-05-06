/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication223;

import java.awt.Image;
import java.io.File;
import javafx.scene.image.ImageView;

public class JavaApplication223 {

    public static void main(String[] args) {
      File file = new File("D:\\SERVER\\Server Content\\Apps\\icons");
      File[] filelist1 = file.listFiles();
      ArrayList<File> filelist2 = new ArrayList<>();
      hb = new HBox();

      for (File file1 : filelist1) {
        filelist2.add(file1);
    }

    System.out.println(filelist2.size());
    gridpane.setPadding(new Insets(50,50,50,50));
    gridpane.setHgap(20);
    gridpane.setVgap(20);

    int imageCol = 0;
    int imageRow = 0;

    for (int i = 0; i < filelist2.size(); i++) {
        System.out.println(filelist2.get(i).getName());
        image = new Image(filelist2.get(i).toURI().toString());
        pic = new ImageView();
        pic.setFitWidth(130);
        pic.setFitHeight(130);
        pic.setImage(image);
        hb.getChildren().add(pic);
        gridpane.add(pic, imageCol, imageRow );

    imageCol++;

    // To check if all the 4 images of a row are completed
    if(imageCol > 2){
      // Reset Column
      imageCol=0;
      // Next Row
      imageRow++;
}
    }
    
