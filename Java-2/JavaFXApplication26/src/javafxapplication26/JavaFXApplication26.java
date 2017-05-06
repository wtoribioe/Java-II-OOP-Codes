/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication26;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFXApplication26 extends Application {
    // Text fileds nodes
    private TextField tfName = new TextField();
    private TextField tfStreet = new TextField();
    private TextField tfCity = new TextField();
    private TextField tfState = new TextField();
    private TextField tfZip = new TextField();
    // Buttons nodes
    private Button btAdd = new Button("Add");
    private Button btFirst = new Button("First");
    private Button btNext = new Button("Next");
    private Button btPrev = new Button("Prev");
    private Button btLast = new Button("Last");
    private Button btUpdate = new Button("Update");
    // Arrays List 
    ArrayList<String> bookList = new ArrayList<>();
    ArrayList<ContactBook> contactList = new ArrayList<>(Arrays.asList());
    java.io.File file = new java.io.File("AddressBook.dat");
    int index = 1;

    @Override
    public void start(Stage primaryStage) throws IOException{
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // The GrodPane to hold nodes
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);
        // Set of UI Text fileds
        gridPane.add(new Label("Full Name:"), 0, 0);
        gridPane.add(tfName, 1, 0);
        gridPane.add(new Label("Street:"), 0, 1);
        gridPane.add(tfStreet , 1, 1);
        gridPane.add(new Label("City:"), 0, 2);
        gridPane.add(tfCity, 1, 2);
        gridPane.add(new Label("State:"), 2, 2);
        gridPane.add(tfState, 3, 2);
        gridPane.add(new Label("Zip:"), 4, 2);
        gridPane.add(tfZip, 5, 2);
        // Set of UI buttons
        gridPane.add(btAdd, 0, 5);
        gridPane.add(btFirst, 1, 5);
        gridPane.add(btNext, 2, 5);
        gridPane.add(btPrev, 3, 5);
        gridPane.add(btLast, 4, 5);
        gridPane.add(btUpdate, 5, 5);
        
        // create listeners
        btAdd.setOnAction(e -> {
            try {
                addContact();
                ObjectFile(file);
            } catch (IOException ex) {
                System.out.println("I/O Eroros: not such file");
            } catch (Exception ex) {
                System.out.println("I/O Eroros: not such file");
            }
        });
        btFirst.setOnAction(e -> firstContact());
        btNext.setOnAction(e -> nextContact(++index));
        btPrev.setOnAction(e -> previousContact(--index));  
        btLast.setOnAction(e -> lastContact());
        btUpdate.setOnAction(e -> {
            try {
                updateContact(index);
                ObjectFile(file);
            } catch (IOException ex) {
                System.out.println("I/O Eroros: not such file");
            } catch (Exception ex) {
                System.out.println("I/O Eroros: not such file");
            }
        });
        Scene scene = new Scene(gridPane,650, 150);
        primaryStage.setTitle("AddressBook!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
     public  void refreshContact() {
        // Cleaning the UI Text fileds
        tfName.setText(" ");
        tfStreet.setText(" ");
        tfCity.setText(" ");
        tfState.setText(" ");
        tfZip.setText(" ");
    }
    public  void addContact() throws IOException {    
        //The file object
        java.io.File file = new java.io.File("AddressBook.dat");
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        String line = tfName.getText() + " " + tfStreet.getText() + " " + tfCity.getText() + " " + 
                tfState.getText()+ " " + tfZip.getText();
        bookList.add(line);
        
        System.out.println(bookList);
        for (String temp : bookList) {
            output.println(temp);
        }
        //Close file
        output.close();
        System.out.println("Is it absolute? " + file.getAbsolutePath());
        System.out.println("The file has " + file.length() + " bytes");
        refreshContact();
 }
    public  void firstContact()  {
        tfName.setText(contactList.get(0).getFullName());
        tfStreet.setText(contactList.get(0).getStreet());
        tfCity.setText(contactList.get(0).getCity());
        tfState.setText(contactList.get(0).getState());
        tfZip.setText(contactList.get(0).getZip());
    }
    public  void nextContact(int index) {
        tfName.setText(contactList.get(index).getFullName());
        tfStreet.setText(contactList.get(index).getStreet());
        tfCity.setText(contactList.get(index).getCity());
        tfState.setText(contactList.get(index).getState());
        tfZip.setText(contactList.get(index).getZip());
    }
    public  void previousContact(int index) {
        tfName.setText(contactList.get(index).getFullName());
        tfStreet.setText(contactList.get(index).getStreet());
        tfCity.setText(contactList.get(index).getCity());
        tfState.setText(contactList.get(index).getState());
        tfZip.setText(contactList.get(index).getZip());
    }
    public  void lastContact() {
        int index = contactList.size() -1;
        tfName.setText(contactList.get(index).getFullName());
        tfStreet.setText(contactList.get(index).getStreet());
        tfCity.setText(contactList.get(index).getCity());
        tfState.setText(contactList.get(index).getState());
        tfZip.setText(contactList.get(index).getZip());
    }
    public  void updateContact(int index) throws IOException {
        //The file object
        java.io.File file = new java.io.File("AddressBook.dat");
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        String line = tfName.getText() + " " + tfStreet.getText() + " " + tfCity.getText() + " " + 
                tfState.getText()+ " " + tfZip.getText();
        bookList.add(line);
        
        System.out.println(bookList);
        for (String temp : bookList) {
            output.println(temp);
        }
        //Close file
        output.close();
        System.out.println("Is it absolute? " + file.getAbsolutePath());
        System.out.println("The file has " + file.length() + " bytes");
        refreshContact();
    }
     public void ObjectFile(File file) throws Exception {
        try { 
            System.out.println("Converting local file to Collection Object .......\n");
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String name = input.next();
                String street = input.next();
                String city = input.next();
                String state = input.next();
                String zip = input.next();
                contactList.add(new ContactBook(name,street,city,state,zip));
                System.out.println("Name: " + name + ", " + "Street: "
                    + street + ", " + "City: " + city + ", " + "State: " + state + ", " + "Zip: " + zip);
            }
        }
        catch (java.io.IOException ex) {
            System.out.println("I/O Errors no such file-");
            System.exit(1);
     }
   }
}