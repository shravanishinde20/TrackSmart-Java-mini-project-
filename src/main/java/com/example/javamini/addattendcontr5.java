package com.example.javamini;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
//import jdk.internal.icu.text.UnicodeSet;


public class addattendcontr5  {
//    @FXML
//    private TableView<TableModel> col_;
//    @FXML
//
////    private TableColumn table_view;
//    private TableColumn<TableModel,String> col_date;
//    @FXML
//    private TableColumn<TableModel,String> col_cid;
//    @FXML
//
//    private TableColumn<TableModel,String> col_sname;
//
//     ObservableList<TableModel>listview= FXCollections.observableArrayList();
    @FXML
    private Label label;
    @FXML
    public DatePicker tf_date;
    @FXML
    private TextField tf_cid;

//    public static void main(String[] args) { launch(args); }





    public void onaddattend(ActionEvent e) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI5.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI5.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } finally {

        }
    }
//    @FXML
//    private TableView<tableview> table;
//    @FXML
//    private TableColumn<tableview, String> sname;
//    @FXML
//    private TableColumn<tableview, String> semailtablecolumn;
//
//    ObservableList<tableview> tableviewSearchModelObservableList = FXCollections.observableArrayList();

//    public void initialize(URL url, ResourceBundle resource){
//
//        DatabaseConnection connectNow = new DatabaseConnection();
//        Connection connectDB = connectNow.getConnection();
//
//        String studentViewQuery = "SELECT StudentName, StudentEmail FROM student";
//
//        try{
//
//            Statement statement = connectDB.createStatement();
//            ResultSet queryOutput = statement.executeQuery(studentViewQuery);
//
//            while (queryOutput.next()){
//
//                String queryStudentName = queryOutput.getString("StudentName");
//                String queryStudentEmail = queryOutput.getString("StudentEmail");
//
//
//                tableviewSearchModelObservableList.add(new tableview(queryStudentName, queryStudentEmail));
//            }
//
//            sname.setCellValueFactory(new PropertyValueFactory<>("StudentName"));
//            semailtablecolumn.setCellValueFactory(new PropertyValueFactory<>("StudentEmail"));
//
//            table.setItems(tableviewSearchModelObservableList);
//
//        } catch (SQLException e) {
//            Logger.getLogger(com.example.javamini.tableviewcontr.class.getName()).log(Level.SEVERE, null, e);
//            e.printStackTrace();
//        }
//    }


//        @FXML
//        private TableView<TableModel> table_view;
//
//        @FXML
//        private TableColumn<TableModel, String> tf_gid;
//        @FXML
//        private TableColumn<TableModel, String> tf_fname;
//        @FXML
//        private TableColumn<TableModel, String> tf_no;



    @FXML
    public void onsess(ActionEvent event) throws IOException, SQLException {

        try{



            if (tf_date.getValue().equals("") && tf_cid.getText().equals(""))
                label.setText("Please enter all required details!");
            else {
                DatabaseConnection connectnow = new DatabaseConnection();
                Connection connectdb = connectnow.getConnection();
                Statement statement = connectdb.createStatement();
                String insertDetails = "INSERT INTO tracksmart.session VALUES ('" + tf_cid.getText() + "', '" + tf_date.getValue() + "') ";
                statement = connectdb.createStatement();
                int a = statement.executeUpdate(insertDetails);
                if (a > 0) {
//                    System.out.println("Inserted data!");
//                    setEmail(tf_email.getText());
//                    Labelsignmsg.setText("Account created successfully!");
                    Parent root = FXMLLoader.load(getClass().getResource("GUI4.fxml")); //pas   s scene name here
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            }
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI3.fxml"));
//            ((Node) (e.getSource())).getScene().getWindow().hide();
//            Parent root1 = fxmlLoader.load(getClass().getResource("GUI3.fxml"));
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root1));
//            stage.show();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void onstudent(ActionEvent e) throws IOException {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI6.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI6.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void onLogout(ActionEvent e) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LOGINPAGEfinal01.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("LOGINPAGEfinal01.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void onprofile(ActionEvent e) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI8.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI8.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
//    public void start(Stage stage) throws Exception {
//
//    }

    public void oncourse(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI4.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI4.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } finally {

        }
    }

    public void onsess1(ActionEvent event) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI3.fxml"));
            ((Node) (event.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI3.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } finally {

        }
    }

//    public void onaa(ActionEvent event) throws IOException {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI4.fxml"));
//            ((Node) (event.getSource())).getScene().getWindow().hide();
//            Parent root1 = fxmlLoader.load(getClass().getResource("GUI4.fxml"));
//            Stage stage = new Stage();
//            stage.setScene(new Scene(root1));
//            stage.show();
//        } finally {
//
//        }
//    }

    public void onsaveattend(ActionEvent event) {
    }

    public void onaddsess(ActionEvent event) {
    }
}
