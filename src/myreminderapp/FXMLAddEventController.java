/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myreminderapp;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import static myreminderapp.FXMLDocumentController.ps;


public class FXMLAddEventController implements Initializable {
      String filepath="";
      String ustemp=FXMLDocumentController.us;
      String pstemp= FXMLDocumentController.ps;
//      String us="pial";
//      String pa="123";
//      if(ustemp.equals(us) && patemp.equals(pa))
//      {
//          filepath = "F:\\[edu]\\Java Lab\\A.txt";
//      }
      @FXML private TableView<AllEvent> tableView;
      @FXML private TableColumn<AllEvent, String> dateColumn;
      @FXML private TableColumn<AllEvent, String> timeColumn;
      @FXML private TableColumn<AllEvent, String> taskColumn;
      @FXML ObservableList<AllEvent> allevents = FXCollections.observableArrayList();
      @FXML JFXTextField description;
      @FXML JFXDatePicker datepick;
      @FXML JFXTimePicker timepick;
      @FXML Label showTask;
      
      @FXML
    private void action_homeButton(ActionEvent event) throws IOException, Exception {
        gif reminder = new gif();
        reminder.work();
      
    }
  
      @FXML
      private void action_addTask(ActionEvent event) throws IOException{

          
         String des = description.getText();
         String times = timepick.getValue().toString();
         String dates = datepick.getValue().toString();
            
          String data = dates+"#"+times+"#"+des;
          System.out.println(""+data);

        allevents.add(new AllEvent(dates,times,des)); 
        tableView.setItems(allevents);
        showTask.setText("Event added");
        
        if( FXMLDocumentController.us.equals("pial") && FXMLDocumentController.ps.equals("123")){
            filepath="F:\\[edu]\\Java Lab\\MyReminderApp\\src\\myreminderapp\\B.txt";
        }
        else{
            filepath="F:\\[edu]\\Java Lab\\MyReminderApp\\src\\myreminderapp\\C.txt";
        }
            //File file = new File(filepath);
//             FileWriter fw = new FileWriter(filepath);
//              PrintWriter pw = new PrintWriter(fw);
//              pw.append(data);
              //bw.write(data);
             // pw.close();
                    FileWriter fw = new FileWriter(filepath, true);
                     BufferedWriter bw = new BufferedWriter(fw);
                     PrintWriter out = new PrintWriter(bw);
                     out.println(data);
                     out.close();
          
              System.out.print("Done");
          }
    
       @FXML
    void action_saveTask(ActionEvent event) throws IOException {
//        if( FXMLDocumentController.us.equals("pial") && FXMLDocumentController.ps.equals("123")){
//            filepath="F:\\[edu]\\Java Lab\\B.txt";
//        }
//        else{
//            filepath="F:\\[edu]\\Java Lab\\C.txt";
//        }
//            
//        FileWriter fw =new FileWriter(filepath,true);
//         BufferedWriter bw =new BufferedWriter(fw);
         
         
         
    }


      @FXML
      private void action_deleteTask(ActionEvent event) throws IOException{
          ObservableList<AllEvent> selectedRows, all;
        all = tableView.getItems();
         selectedRows = tableView.getSelectionModel().getSelectedItems();

       for (AllEvent person: selectedRows)
        {
            all.remove(person);
        }
        tableView.setItems(all);
        showTask.setText("Event deleted");
        
            if( FXMLDocumentController.us.equals("pial") && FXMLDocumentController.ps.equals("123")){
            filepath="F:\\[edu]\\Java Lab\\MyReminderApp\\src\\myreminderapp\\B.txt";
        }
        else{
            filepath="F:\\[edu]\\Java Lab\\MyReminderApp\\src\\myreminderapp\\C.txt";
        }   
             FileWriter fw = new FileWriter(filepath);
              PrintWriter pw = new PrintWriter(fw);
              pw.write("");    
             BufferedWriter writer = new BufferedWriter(fw);
        for(AllEvent persons: all){
            String dataset = persons.getDate() +"#"+persons.getTime()+"#"+persons.getTask();
              writer.write(dataset);
              writer.newLine();
    }
        writer.close();
      }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dateColumn.setCellValueFactory(new PropertyValueFactory<AllEvent, String>("Date"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<AllEvent, String>("Time"));
        taskColumn.setCellValueFactory(new PropertyValueFactory<AllEvent, String>("Task"));

        
              try {
                  tableView.setItems(getEvent());
                  
        tableView.setEditable(true);
        dateColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        timeColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        taskColumn.setCellFactory(TextFieldTableCell.forTableColumn());
         tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
              } catch (IOException ex) {
                  Logger.getLogger(FXMLAddEventController.class.getName()).log(Level.SEVERE, null, ex);
              }
    }
        public ObservableList<AllEvent>  getEvent() throws FileNotFoundException, IOException
    {
        FileReader file;
        if( ustemp.equals("pial") && pstemp.equals("123")){
         file = new FileReader("F:\\[edu]\\Java Lab\\MyReminderApp\\src\\myreminderapp\\B.txt");
          
        }
        else{
           file = new FileReader("F:\\[edu]\\Java Lab\\MyReminderApp\\src\\myreminderapp\\C.txt");            
            
        }
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
       
        String text = "";
        while(line != null){
            text += line;
             String[] tokens = text.split("#");
            String eventdate = tokens[0];
             String eventtime = tokens[1];
             String eventtask = tokens[2];
          line = reader.readLine();
             allevents.add(new AllEvent(eventdate,eventtime,eventtask));
            text = "";
        }

       
        return allevents;
    }
    
}
