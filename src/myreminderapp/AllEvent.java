/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myreminderapp;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Tanjiqur Prince
 */
public class AllEvent {
    SimpleStringProperty Date,Time,Task;
    
    public AllEvent(String date, String time, String task){
        this.Date = new SimpleStringProperty(date);
        this.Time = new SimpleStringProperty(time);
        this.Task = new SimpleStringProperty(task);
     
    }

    public String getDate() {
        return Date.get();
    }

    public String getTime() {
        return Time.get();
    }

    public String getTask() {
        return Task.get();
    }

    public void setDate(SimpleStringProperty date) {
        this.Date = date;
    }

    public void setTime(SimpleStringProperty time) {
        this.Time = time;
    }

    public void setTask(SimpleStringProperty task) {
        this.Task = task;
    }
    
    
}
