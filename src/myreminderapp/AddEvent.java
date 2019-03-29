/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myreminderapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Tanjiqur Prince
 */
public class AddEvent implements Initializable{
    void getwork() throws IOException{
                 Stage stage = MyReminderApp.getPrimaryStage();
             Parent root = FXMLLoader.load(getClass().getResource("FXMLAddEvent.fxml"));
         

                Scene scene2 = new Scene(root);

               stage.setTitle("My Reminding Assistant");
               stage.setScene(scene2);
              stage.show();  
              
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
