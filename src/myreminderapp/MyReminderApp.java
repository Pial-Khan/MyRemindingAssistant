/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myreminderapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Tanjiqur Prince
 */
public class MyReminderApp extends Application {
    
    
    static Stage primaryStage;
    public Scene scene;
    
    private void setPrimaryStage(Stage stage) {
      MyReminderApp.primaryStage = stage;   
    }
            
     void getStart() throws Exception{
            start(primaryStage);
        }
    
    @Override
    public void start(Stage stage) throws Exception {
        setPrimaryStage(stage);
     //   Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
           Parent root = FXMLLoader.load(getClass().getResource("gif.fxml"));
           
        Scene scene = new Scene(root);
        
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Reminding Assistant");
        primaryStage.show();
    }

    
     static public Stage getPrimaryStage() {
       
        primaryStage.setTitle("My Reminding Assistant");
        return MyReminderApp.primaryStage;
    }
    
}
