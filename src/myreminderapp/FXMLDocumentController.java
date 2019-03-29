/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myreminderapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Tanjiqur Prince
 */
public class FXMLDocumentController implements Initializable {
    static String us="";
    static String ps="";
    static Map<String, String> m = new HashMap<String, String>();
   
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label label; 

   
     @FXML
    private void action_login(ActionEvent event) throws FileNotFoundException, IOException{

         us = username.getText();
         ps =password.getText();
         
         FileReader file = new FileReader("F:\\[edu]\\Java Lab\\MyReminderApp\\src\\myreminderapp\\member.txt");
         BufferedReader reader = new BufferedReader(file);
         String line = reader.readLine();
         String test="";
         while(line != null ){
             test += line;
             String[] tokens = test.split("#");
             String user = tokens[0];
             String pass = tokens[1];
           line = reader.readLine();
             m.put(user , pass); 
              test= ""; }
                        
               if(m.get(us).equals(ps)){

                   AddEvent addevent = new AddEvent();
                   addevent.getwork();

                   }
               
                
               else label.setText("Invalid user!");
    
    }

     @FXML
    private void action_signUp(ActionEvent event) throws IOException {
        SignUp signup = new SignUp();
        signup.work();
              }
    
    @FXML
    private void action_calender(ActionEvent event) throws IOException {
        calender c =new calender();
        c.work();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
