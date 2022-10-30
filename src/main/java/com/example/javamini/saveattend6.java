package com.example.javamini;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.lang.module.ResolvedModule;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class saveattend6 extends NullPointerException {
    @FXML
    private Label label;



//        @FXML
//        private TableView<tableviewname> studenttableview;
//        @FXML
//        private TableColumn<tableviewname, String> snametablecolumn;
//     //
//
//        ObservableList<tableviewname> tableviewSearchModelObservableList = FXCollections.observableArrayList();
//
//        public void initialize(URL url, ResourceBundle resource){
//
//            DatabaseConnection connectNow = new DatabaseConnection();
//            Connection connectDB = connectNow.getConnection();
//
//            String studentViewQuery = "SELECT StudentName FROM student";
//
//            try{
//
//                Statement statement = connectDB.createStatement();
//                ResultSet queryOutput = statement.executeQuery(studentViewQuery);
//
//                while (queryOutput.next()){
//
//                    String queryStudentName = queryOutput.getString("StudentName");
//                    //String queryStudentEmail = queryOutput.getString("StudentEmail");
//
//
//                    tableviewSearchModelObservableList.add(new tableviewname(queryStudentName));
//                }
//
//                snametablecolumn.setCellValueFactory(new PropertyValueFactory<>("StudentName"));
//                //semailtablecolumn.setCellValueFactory(new PropertyValueFactory<>("StudentEmail"));
//
//                studenttableview.setItems(tableviewSearchModelObservableList);
//
//            } catch (SQLException e) {
//                Logger.getLogger(com.example.javamini.tableviewcontr.class.getName()).log(Level.SEVERE, null, e);
//                e.printStackTrace();
//            }
//        }




//    public static void main(String[] args) { launch(args); }


    public void onaddsessions(ActionEvent e) throws IOException {
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI3.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI3.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }

    public void onback(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI4.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI4.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }

    public void onLogout(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LOGINPAGEfinal01.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("LOGINPAGEfinal01.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }
    public void onprofile(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI8.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI8.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }
    public void onstudent(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI6.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI6.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }
    public void start(Stage stage) throws Exception {

    }

}
