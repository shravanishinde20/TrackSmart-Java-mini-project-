//package com.example.javamini;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.fxml.Initializable;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.TextField;
//import javafx.scene.control.cell.PropertyValueFactory;
//
//import java.net.URL;
//import java.sql.Date;
//import java.util.ResourceBundle;
//import java.time.LocalDate;
//
//public class table2 implements Initializable {
//    public TableView<table2> tableView;
//
//    public TableColumn<table2,Integer> cid;
//    public TableColumn<table2,Integer> date;
//    public TextField courseidtf;
//    public TextField datepicker;
//
//
//
//    public table2(String text, String text1) {
//    }
//
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        cid.setCellValueFactory(new PropertyValueFactory<>("CourseId"));
//        date.setCellValueFactory(new PropertyValueFactory<>("date"));
//
//
//    }
//
//
//
//    public void onaddbutton(ActionEvent actionEvent) {
//        Date newValue;
//        table2 table2=new table2(courseidtf.getText(),datepicker.getText());
//                tableView.getItems().add(table2);
//    }
//}
