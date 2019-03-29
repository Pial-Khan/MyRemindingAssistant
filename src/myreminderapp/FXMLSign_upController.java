
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myreminderapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Tanjiqur Prince
 */
public class FXMLSign_upController implements Initializable {


    @FXML
    private PasswordField signUpPassword;

    @FXML
    private TextField signUpUsername;
     
    @FXML
    private void action_home(ActionEvent event) throws IOException, Exception {
        gif app =new gif();
        app.work();
      
    }
    @FXML
    private void action_signUp(ActionEvent event) throws IOException, Exception {
        System.out.println("clicked!");

       System.out.println(""+signUpUsername.getText());
        
        FXMLDocumentController.m.put(signUpUsername.getText() , signUpPassword.getText());
         FXMLDocumentController.us = signUpUsername.getText();
         FXMLDocumentController.ps = signUpPassword.getText();
           AddEvent addevent = new AddEvent();
            addevent.getwork();
             System.out.println("sfdz");
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
