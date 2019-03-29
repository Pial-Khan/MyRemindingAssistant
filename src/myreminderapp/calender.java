package myreminderapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class calender implements Initializable {
         void work() throws IOException  {
             Stage stage = MyReminderApp.getPrimaryStage();
             Parent root = FXMLLoader.load(getClass().getResource("calender.fxml"));
          

                Scene scene2 = new Scene(root, 700, 400);

                stage.setTitle("My Reminding Assistant");
               stage.setScene(scene2);
              stage.show();  
              
    }
         
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
