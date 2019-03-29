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
public class gifController implements Initializable {


    
    @FXML
    private void action_tap(ActionEvent event) throws Exception {
          gif g =new gif();
          g.work();
       
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {}
    
    
}