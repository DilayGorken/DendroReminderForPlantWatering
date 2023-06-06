package com.gazi.demo2_mobileapp;

public class Reminders {

    String taskId,date,time,taskTitle,taskDescription;

    public Reminders(){

    }

    public Reminders( String date, String time, String taskId,String taskTitle, String taskDescription) {
        this.taskId = taskId;
        this.date = date;
        this.time = time;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
    }


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
