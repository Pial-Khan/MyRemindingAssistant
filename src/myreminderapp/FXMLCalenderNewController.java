/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myreminderapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class FXMLCalenderNewController implements Initializable {

    @FXML
    private  WebView webview;
    
    @FXML
    private void actionHome(ActionEvent event) throws Exception {
        gif reminder = new gif();
        reminder.work();
       
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
               System.setProperty("sun.net.http.allowRestrictedHeaders","true");
               
               WebEngine engine = webview.getEngine();
               com.sun.javafx.webkit.WebConsoleListener.setDefaultListener(
            (webView, message, lineNumber, sourceId)-> System.out.println("Console: [" + sourceId + ":" + lineNumber + "] " + message)
        );

               engine.load("https://www.google.com/calendar");
    }    
    
}