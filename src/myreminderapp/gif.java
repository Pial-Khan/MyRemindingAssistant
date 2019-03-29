/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myreminderapp;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class gif implements Initializable{
    
             void work() throws IOException  {
                 
             Stage stage = MyReminderApp.getPrimaryStage();
          //   Parent root = FXMLLoader.load(getClass().getResource("gif.fxml"));
         Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

                Scene scene2 = new Scene(root);
                stage.setOnCloseRequest(e ->{
                    e.consume();
                    closeProgram();
                    
                });

               stage.setTitle("My Reminding Assistant");
               stage.setScene(scene2);
               stage.show();  
              
    }
             private void closeProgram() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("My Reminding Assistant");
        alert.setContentText("Are you sure to exit?");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        } }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
