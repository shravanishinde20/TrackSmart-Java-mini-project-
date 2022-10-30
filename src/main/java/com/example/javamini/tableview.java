package com.example.javamini;

import javafx.collections.ObservableList;

public class tableview {
    String StudentName, StudentEmail;

    public tableview(String StudentName, String StudentEmail) {
        this.StudentName = StudentName;
        this.StudentEmail = StudentEmail;
    }

//    public static void setItems(ObservableList<tbv2> listview2) {
//    }

    public String getStudentName() {
        return StudentName;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }
}

