package com.example.javamini;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class STUcontr7 implements Initializable {

    @FXML
    private TableView<tableview> studenttableview;
    @FXML
    private TableColumn<tableview, String> snametablecolumn;
    @FXML
    private TableColumn<tableview, String> semailtablecolumn;
    @FXML
    private TextField searchtf;
    ObservableList<tableview> tableviewSearchModelObservableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resource){

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String studentViewQuery = "SELECT StudentName, StudentEmail FROM student limit 0,5";

        try{

            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(studentViewQuery);

            while (queryOutput.next()){

                String queryStudentName = queryOutput.getString("StudentName");
                String queryStudentEmail = queryOutput.getString("StudentEmail");


                tableviewSearchModelObservableList.add(new tableview(queryStudentName, queryStudentEmail));
            }

            snametablecolumn.setCellValueFactory(new PropertyValueFactory<>("StudentName"));
            semailtablecolumn.setCellValueFactory(new PropertyValueFactory<>("StudentEmail"));

            studenttableview.setItems(tableviewSearchModelObservableList);

            FilteredList<tableview> filteredData = new FilteredList<>(tableviewSearchModelObservableList, b -> true);

            searchtf.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(tableview -> {

                    if (newValue.isEmpty() || newValue.isBlank() || newValue == null) {
                        return true;
                    }

                    String searchstudentsname = newValue.toLowerCase();

                    if(tableview.getStudentName().toLowerCase().indexOf(searchstudentsname) > -1){
                        return true;
                    } else if (tableview.getStudentEmail().toLowerCase().indexOf(searchstudentsname) > -1) {
                       return true;
                    }else
                        return false;
                });
            });

            SortedList<tableview> sortedData = new SortedList<>(filteredData);

            sortedData.comparatorProperty().bind(studenttableview.comparatorProperty());

            studenttableview.setItems(sortedData);

        } catch (SQLException e) {
            Logger.getLogger(tableviewcontr.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    }




    private Label label;

//    public static void main(String[] args) { launch(args); }


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

    public void onCourse(ActionEvent e) throws IOException {

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

    public void oncf(ActionEvent e) throws IOException {

        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI7.fxml"));
            ((Node) (e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load(getClass().getResource("GUI7.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }


    public void start(Stage stage) throws Exception {

    }


}
